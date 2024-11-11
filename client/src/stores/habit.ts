import { ref, computed } from 'vue'
import { defineStore } from 'pinia'

import type { Habit,Habits } from '@/types/habits'
import { HabitsSchema } from '@/types/habits'

import useFetch from '@/composables/useFetch'




export default defineStore('habitStore', () => {

  const habits = ref<Array<Habit>>([])

  async function add (habit:Omit<Habit,'id'>):Promise<string> {
    const { data } = await useFetch('/habit').post(habit).json()
    if(data.value.message === 'Added!') {
      habits.value.push({...habit, id: data.value.id})
    }
    return data.value.message as string
  }


  async function get ():Promise<Habits> {
    const { data } = await useFetch('/habits').get().json()
    const _habits:Habits = HabitsSchema.parse(data.value)
    _habits?.forEach(h=>habits.value.push(h))
    return _habits
  }

  return { add, get, habits }

})
