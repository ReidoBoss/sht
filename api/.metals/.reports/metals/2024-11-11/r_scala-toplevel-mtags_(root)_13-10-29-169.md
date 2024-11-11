error id: file://<WORKSPACE>/app/model/domain/HabitHistory.scala:[64..65) in Input.VirtualFile("file://<WORKSPACE>/app/model/domain/HabitHistory.scala", "package domain.habit

import java.util.{ UUID,Date }

case class(
  idHabit:UUID,
  isDone:Boolean,
  date:Date()
)
// CREATE TABLE "HABIT_HISTORY"(
//   "ID_HABIT" UUID REFERENCES "HABITS"("ID"),
//   "IS_DONE" BOOLEAN,
//   "DATE" DATE
// );
")
file://<WORKSPACE>/app/model/domain/HabitHistory.scala
file://<WORKSPACE>/app/model/domain/HabitHistory.scala:5: error: expected identifier; obtained lparen
case class(
          ^
#### Short summary: 

expected identifier; obtained lparen