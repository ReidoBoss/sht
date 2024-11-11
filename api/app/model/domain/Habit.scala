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
    "goal"  -> nonEmptyText
  )(Habit.apply)(Habit.unapply)
)

case class HabitHistory(
  idHabit:UUID,
  date:Date
)

object HabitHistory {
  given Format[HabitHistory] = Json.format[HabitHistory]
}

