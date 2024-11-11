import { ref } from 'vue'
import { defineStore } from 'pinia'

import type { Habit,Habits } from '@/types/habits'
import { HabitsSchema } from '@/types/habits'

import useFetch from '@/composables/useFetch'

export default defineStore('habitStore', () => {

  type ExtendedHabit = {
    isDone: boolean,
    daysCompleted:number,
    streak: number
  }
  const habits = ref<Array<Habit&ExtendedHabit>>([])

  async function updateById(id:string):Promise<void> {
    await useFetch('/habit/today').put({id:id}).json()
  }

  async function deleteById(id:string):Promise<void> {
    const { data } = await useFetch('/habit').delete({ id }).json();
    if (data?.value?.message === 'deleted') {
      const indexFound = habits.value.findIndex(h => h.id === id);
      if (indexFound !== -1) habits.value.splice(indexFound, 1);
    }
  }

  async function _getTotalDays(id:string):Promise<number> {
    const { data } = await useFetch(`/habit/completed/${id}`).get().json()
    if (data && Array.isArray(data.value)) {
      return data.value.length
    }
    return 0
  }

  async function _getStreakById(id:string):Promise<number> {
    const { data } = await useFetch(`/habit/streak/${id}`).get().json()
    if (data && Array.isArray(data.value)) {
      return data.value.length
    }
    return 0
  }


  async function getMyHabitToday():Promise<void> {
    const { data } = await useFetch('/habits/today').get().json()
    if (data && Array.isArray(data.value)) {
      data.value.forEach((habitStatus: any) => {
        const found = habits.value.find(habit => habit.id === habitStatus.idHabit)
        if (found) found.isDone = habitStatus.isDone
      })
    }
  }

  async function add (habit:Omit<Habit,'id'>):Promise<string> {
    const { data } = await useFetch('/habit').post(habit).json()
    if(data.value.message === 'Added!') {
      habits.value.push({
        ...habit,
        id: data.value.id,
        isDone:false,
        daysCompleted: 0,
        streak: 0,
      })
    }
    return data.value.message as string
  }


  async function get ():Promise<Habits> {
    const { data } = await useFetch('/habits').get().json()
    const _habits:Habits = HabitsSchema.parse(data.value)
    _habits?.forEach(async (h)=>habits.value.push({
      ...h,
      isDone:false,
      daysCompleted: await _getTotalDays(h.id),
      streak: await _getStreakById(h.id),
    }))
    await getMyHabitToday()
    return _habits
  }

  return { add, get, habits,getMyHabitToday,updateById,deleteById }

})
