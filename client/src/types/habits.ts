import { z } from 'zod'

const HabitSchema = z.object({
  name: z.string(),
  goal: z.string(),
  id: z.string()
})

export const HabitsSchema = z.array(HabitSchema).optional()

export type Habit = z.infer<typeof HabitSchema>
export type Habits = z.infer<typeof HabitsSchema>
