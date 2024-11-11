package services.habit

import repo.habit.{ HabitRepo, HabitHistoryRepo }
import domain.habit._
import utils.results._

import javax.inject._
import play.api.libs.json._
import scala.concurrent.Future
import java.util.{ Date,UUID }
import scala.concurrent.{ ExecutionContext, Future }

@Singleton
class HabitServices @Inject()(
  habitRepo: HabitRepo,
  historyRepo: HabitHistoryRepo
)(using ExecutionContext) {

  def add ( habit:Habit ) = {
    for {
      existingName <- habitRepo.getByName(habit.name)
      result <- existingName match {
        case Some(_) => Future(HABIT_ALREADY_EXIST)
          case None => habitRepo.add ( habit ) map {
            case 1 => ADD_HABIT(habit.id)
            case _ => ADD_HABIT_FAILED
        }
      }
    } yield result
  }

  def deleteById(id:UUID) = {
    for {
      habit <- habitRepo.getById(id)
      result <- habit match {
        case None => Future(DELETE_HABIT_FAILED)
        case Some(habit) => habitRepo.deleteById(habit.id) map {
          case 1 => DELETED_HABIT
          case _ => DELETE_HABIT_FAILED
        }
      }
    } yield result
  }

  def getAll = {
    habitRepo.getAll map {
      case habit:Seq[Habit] => HABIT_RETRIEVE(Json.toJson(habit))
      case null => GET_HABIT_FAILED
    }
  }

  def getTotalDaysCompltedById(id:UUID) = {
    historyRepo.getCompletedById(id) map {
      case habit:Seq[HabitHistory] => HABIT_RETRIEVE(Json.toJson(habit))
      case null => GET_HABIT_FAILED
    }
  }

  def getByDate(date:Date) = {
    historyRepo.getByDate(date) map {
      case history: Seq[HabitHistory] => HABIT_HISTORY_RETRIEVE(Json.toJson(history))
      case null => GET_HABIT_FAILED
    }
  }

  def getStreakById(id:UUID) = {
    historyRepo.getConsecutiveDaysCount(id) map {
      case streak:Int =>  HABIT_STREAK(streak)
    }
  }

  def updateTodaysHabitById(id:UUID) = {
    for {
      idNow <- historyRepo.getByIdOpt(id)
      result <- idNow match {
        case Some(history) => historyRepo.updateById(id,!history.isDone) map {
          case 1 => UPDATED_HABIT
          case _ => UPDATE_HABIT_FAILED
        }
        case None =>  {
          val newHistory = HabitHistory(id,true,new Date())
          historyRepo.add(newHistory) map {
            case 1 => UPDATED_HABIT
            case _ => UPDATE_HABIT_FAILED
          }
        }
      }
    } yield result
  }


}
