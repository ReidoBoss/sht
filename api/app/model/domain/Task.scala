package domain.task
import java.util.{ UUID , Date}


case class Habit(
  name: String,
  goal: String,
  isCompleted:Boolean,
  date: Date,
  id: UUID = UUID.randomUUID()
);
