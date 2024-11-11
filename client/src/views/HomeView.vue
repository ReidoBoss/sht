<script setup lang="ts">
  import HabitForm from '@/components/HabitForm.vue'
  import HabitContainer from '@/components/HabitContainer.vue'
</script>

<template>
  <div class="container">
    <section class="habit-form-section">
      <h2 class="section-title">Add a New Habit</h2>
      <HabitForm />
    </section>

    <section class="habit-list-section">
      <h2 class="section-title">Your Habits</h2>
      <HabitContainer />
    </section>
  </div>
</template>

<style scoped>
.container {
  display: flex;
  flex-direction: column;
  gap: 32px;
  padding: 20px;
  max-width: 900px;
  margin: 0 auto;
}

h2.section-title {
  font-size: 1.5rem;
  font-weight: 600;
  margin-bottom: 16px;
  color: #333;
}

.habit-form-section,
.habit-list-section {
  background-color: #ffffff;
  padding: 20px;
  border-radius: 8px;
  box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
}

.habit-form-section {
  background-color: #f9f9f9;
}

.habit-list-section {
  background-color: #fff;
  border: 1px solid #e0e0e0;
}

@media (max-width: 768px) {
  .container {
    padding: 10px;
  }

  h2.section-title {
    font-size: 1.25rem;
  }

  .habit-form-section,
  .habit-list-section {
    padding: 15px;
  }
}
</style>
