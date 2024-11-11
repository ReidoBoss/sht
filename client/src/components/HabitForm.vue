<template>
  <button @click="toggleForm" class="toggle-form-btn">
    {{ showForm ? 'Hide Habit Form' : 'Add a Habit' }}
  </button>

  <form v-if="showForm" @submit.prevent="submit" class="habit-form">
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
  const showForm = ref(false)

  const habitStore = useHabitStore()
  const { add, get,getMyHabitToday } = habitStore

  function toggleForm() {
    showForm.value = !showForm.value
  }

  async function submit() {
    const habitForm = {
      name: name.value,
      goal: goal.value,
    }
    await add(habitForm)
    goal.value = ''
    name.value = ''
  }

  onMounted( async () => {
    await get()
    await getMyHabitToday()
  })
</script>

<style scoped>


.toggle-form-btn {
  background-color: var(--color-info);
  color: white;
  border: none;
  padding: 10px 16px;
  font-size: 1rem;
  border-radius: 4px;
  cursor: pointer;
  transition: background-color 0.3s;
  margin: 20px auto;
  display: block;
  max-width: 200px;
  text-align: center;
}

.habit-form {
  background-color: var(--color-light);
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
  color: var(--color-text);
}


.form-group {
  display: flex;
  flex-direction: column;
  gap: 8px;
}


.form-label {
  font-size: 1rem;
  font-weight: 600;
  color: var(--color-muted);
}


.form-input {
  padding: 12px;
  font-size: 1rem;
  border: 1px solid #ccc;
  border-radius: 4px;
  transition: border-color 0.3s;
}

.form-input:focus {
  border-color: var(--color-success);
  outline: none;
}


.submit-btn {
  background-color: var(--color-success);
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
