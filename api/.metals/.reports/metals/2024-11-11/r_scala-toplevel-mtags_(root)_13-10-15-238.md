error id: file://<WORKSPACE>/app/model/domain/HabitHistory.scala:[112..113) in Input.VirtualFile("file://<WORKSPACE>/app/model/domain/HabitHistory.scala", "package domain.habit

import java.util.UUID
import org.apache.pekko.http.scaladsl.model.headers.Date

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
file://<WORKSPACE>/app/model/domain/HabitHistory.scala:6: error: expected identifier; obtained lparen
case class(
          ^
#### Short summary: 

expected identifier; obtained lparen