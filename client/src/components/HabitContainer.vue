<template>
  <div class="habit-container">
    <button @click="toggleHabits" class="toggle-button">
      {{ isVisible ? 'Hide Habits' : 'Show Habits' }}
    </button>

    <div v-if="isVisible" class="habit-list">
      <div
        class="habit-card"
        v-for="(habit, index) in habits"
        :key="habit.id"
      >
        <h3 class="habit-name">{{ habit.name }}</h3>
        <p class="habit-goal">{{ habit.goal }}</p>
      </div>
    </div>
  </div>
</template>

<script lang="ts" setup>
  import { storeToRefs } from 'pinia'
  import { ref } from 'vue'
  import useHabitStore from '@/stores/habit'

  const habitStore = useHabitStore()
  const { habits } = storeToRefs(habitStore)

  const isVisible = ref(false)

  function toggleHabits() {
    isVisible.value = !isVisible.value
  }
</script>

<style scoped>
.habit-container {
  padding: 20px;
  max-width: 800px;
  margin: 0 auto;
}

.toggle-button {
  background-color: #4CAF50;
  color: white;
  border: none;
  padding: 10px 20px;
  font-size: 1rem;
  cursor: pointer;
  border-radius: 5px;
  transition: background-color 0.3s;
  margin-bottom: 20px;
}

.toggle-button:hover {
  background-color: #45a049;
}

.habit-list {
  display: flex;
  flex-direction: column;
  gap: 16px;
}

.habit-card {
  background-color: #f9f9f9;
  border-radius: 8px;
  padding: 16px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s, box-shadow 0.3s;
}

.habit-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 4px 16px rgba(0, 0, 0, 0.2);
}

.habit-name {
  font-size: 1.25rem;
  font-weight: 600;
  margin-bottom: 8px;
  color: #333;
}

.habit-goal {
  font-size: 1rem;
  color: #555;
}
</style>
