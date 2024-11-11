package services.habit

import repo.habit.HabitRepo
import domain.habit
import javax.inject._
import scala.concurrent.Future
import domain.habit.Habit
import java.util.{ Date,UUID }
import java.sql.Date
import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class HabitServices @Inject() (habitRepo:HabitRepo)(using ExecutionContext) {

  def add ( habit:Habit ) = {
    for {
      existingName <- habitRepo.getByName(habit.name)

      result <- Future("meow cat!")
    } yield result

  }
}
