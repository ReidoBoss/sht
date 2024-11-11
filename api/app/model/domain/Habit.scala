package domain.habit
import java.util.{ UUID , Date}
import play.api.libs.json._
import play.api.data._
import play.api.data.Forms._

case class Habit(
  name: String,
  goal: String,
  isCompleted:Boolean,
  id: UUID = UUID.randomUUID()
) {

  def toJson = Json.obj(
    "name" -> name,
    "goal" -> goal,
    "isCompleted" -> isCompleted
  )
}

object Habit {

  def apply (
    name: String,
    goal: String,
    isCompleted:Boolean
  ) = {
    new Habit(name,goal,isCompleted)
  }

  def unapply( habit: Habit ) = {
    Some((
      habit.name,
      habit.goal,
      habit.isCompleted
    ))
  }

  given Writes[Habit] = Json.writes[Habit]

}

val habitForm = Form(
  mapping(
    "name" -> text,
    "goal"  -> text,
    "isCompleted" -> boolean
  )(Habit.apply)(Habit.unapply)
)

case class HabitHistory(
  idHabit:UUID,
  date:Date
)

object HabitHistory {
  given Format[HabitHistory] = Json.format[HabitHistory]
}

