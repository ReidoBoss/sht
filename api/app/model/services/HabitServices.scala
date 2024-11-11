package services.habit

import repo.habit.HabitRepo
import domain.habit
import utils.results._

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
      result <- existingName match {
        case Some(_) => Future(HABIT_ALREADY_EXIST)
          case None => habitRepo.add ( habit ) map {
            case 1 => ADD_HABIT
            case _ => ADD_HABIT_FAILED
        }
      }
      resultMEow = Future("cat")
    } yield resultMEow
  }
}
