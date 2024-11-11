package domain.task
import java.util.{ UUID , Date}
import play.api.libs.json._

case class Habit(
  name: String,
  goal: String,
  isCompleted:Boolean,
  date: Date,
  id: UUID = UUID.randomUUID()
) {

  def toJson = Json.obj(
    "id" -> id,
    "name" -> name,
    "goal" -> goal,
    "isCompleted" -> isCompleted,
    "date" -> date,
  )
}

object Habit {

  def apply (
    name: String,
    goal: String,
    isCompleted:Boolean,
    date: Date
  ) = {
    new Habit(name,goal,isCompleted,date)
  }

  def unapply( habit: Habit ) = {
    Some((
      habit.name,
      habit.goal,
      habit.isCompleted,
      habit.date
    ))
  }

  given Writes[Habit] = Json.writes[Habit]

}

