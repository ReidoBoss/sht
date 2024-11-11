package domain.habit
import java.util.{ UUID , Date}
import play.api.libs.json._
import play.api.data._
import play.api.data.Forms._

case class Habit(
  name: String,
  goal: String,
  id: UUID = UUID.randomUUID()
) {

  def toJson = Json.obj(
    "name" -> name,
    "goal" -> goal
  )
}

object Habit {

  def apply (
    name: String,
    goal: String
  ) = {
    new Habit(name,goal)
  }

  def unapply( habit: Habit ) = {
    Some((
      habit.name,
      habit.goal
    ))
  }

  given Writes[Habit] = Json.writes[Habit]

}

val habitForm = Form(
  mapping(
    "name" -> nonEmptyText,
    "goal"  -> text
  )(Habit.apply)(Habit.unapply)
)

case class HabitHistory (
  idHabit:UUID,
  isDone:Boolean,
  date:Date = new Date()
)

object HabitHistory {
  def apply(  idHabit:UUID, isDone:Boolean) = new HabitHistory(idHabit,isDone)
  def unapply(history:HabitHistory) = Some((history.idHabit,history.isDone))
  given Format[HabitHistory] = Json.format[HabitHistory]
}

val habitHistoryForm = Form (
  mapping(
    "idHabit" -> uuid,
    "isDone" -> boolean
  )(HabitHistory.apply)(HabitHistory.unapply)
)
