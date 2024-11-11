<template>
  <form @submit.prevent="submit" class="habit-form">
    <h2 class="form-title">Add a New Habit</h2>
    <div class="form-group">
      <label for="habit-name" class="form-label">Habit Name</label>
      <input
        id="habit-name"
        type="text"
        v-model="name"
        class="form-input"
        placeholder="Enter habit name"
        required
      />
    </div>

    <div class="form-group">
      <label for="habit-goal" class="form-label">Habit Goal</label>
      <input
        id="habit-goal"
        type="text"
        v-model="goal"
        class="form-input"
        placeholder="Enter habit goal"
        required
      />
    </div>
    <button type="submit" class="submit-btn">Add Habit</button>
  </form>
</template>

<script lang="ts" setup>
  import { onMounted, ref } from 'vue'
  import useHabitStore from '@/stores/habit'

  const name = ref('')
  const goal = ref('')

  const habitStore = useHabitStore()
  const { add, get } = habitStore

  async function submit() {
    const habitForm = {
      name: name.value,
      goal: goal.value,
    }
    await add(habitForm)
    goal.value = ''
    name.value = ''
  }

  onMounted(() => {
    get()
  })
</script>

<style scoped>
.habit-form {
  background-color: #fff;
  border-radius: 8px;
  padding: 30px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
  max-width: 600px;
  margin: 0 auto;
  display: flex;
  flex-direction: column;
  gap: 20px;
}

.form-title {
  font-size: 1.75rem;
  font-weight: bold;
  margin-bottom: 15px;
  color: #333;
}

.form-group {
  display: flex;
  flex-direction: column;
  gap: 8px;
}

.form-label {
  font-size: 1rem;
  font-weight: 600;
  color: #444;
}

.form-input {
  padding: 12px;
  font-size: 1rem;
  border: 1px solid #ccc;
  border-radius: 4px;
  transition: border-color 0.3s;
}

.form-input:focus {
  border-color: #4CAF50;
  outline: none;
}

.submit-btn {
  background-color: #4CAF50;
  color: white;
  border: none;
  padding: 12px 20px;
  font-size: 1rem;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s;
}

.submit-btn:hover {
  background-color: #45a049;
}

@media (max-width: 768px) {
  .habit-form {
    padding: 20px;
  }

  .form-title {
    font-size: 1.5rem;
  }
}
</style>
