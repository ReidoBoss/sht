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
        <p class="habit-goal">
          <span v-if="habit.goal">{{ habit.goal }}</span>
          <span v-else>No goal</span>
        </p>
        <button @click="deleteById(habit.id)" class="delete-button">
          Delete
        </button>
      </div>
    </div>
  </div>
</template>

<script lang="ts" setup>
  import { storeToRefs } from 'pinia'
  import { ref } from 'vue'
  import useHabitStore from '@/stores/habit'

  const habitStore = useHabitStore()
  const { deleteById } = habitStore
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
  background-color: var(--color-info);
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
  background-color: var(--color-info);
}


.habit-list {
  display: flex;
  flex-direction: row;
  gap: 16px;
  overflow-x: auto;
  padding-bottom: 16px;
  scrollbar-width: thin;
}

.habit-list::-webkit-scrollbar {
  height: 8px;
}

.habit-list::-webkit-scrollbar-thumb {
  background-color: #888;
  border-radius: 10px;
}

.habit-list::-webkit-scrollbar-thumb:hover {
  background-color: #555;
}


.habit-card {
  background-color: var(--color-light);
  border-radius: 8px;
  padding: 16px;
  box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s, box-shadow 0.3s;
  min-width: 200px;
  min-height: 100px;
}

.habit-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 4px 16px rgba(0, 0, 0, 0.2);
}


.habit-name {
  font-size: 1.25rem;
  font-weight: 600;
  margin-bottom: 8px;
  color: var(--color-text);
}


.habit-goal {
  font-size: 1rem;
  color: var(--color-muted);
}


.delete-button {
  padding: 5px 10px;
  background-color: var(--color-danger);
  color: white;
  border: none;
  cursor: pointer;
  border-radius: 5px;
}

.delete-button:hover {
  background-color: var(--color-danger);
}
</style>
