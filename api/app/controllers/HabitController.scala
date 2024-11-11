package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._
import scala.concurrent.{ ExecutionContext, Future }
import play.api.i18n.I18nSupport
import java.util.{ Date, UUID }

import services.habit.HabitServices
import domain.habit._
import utils.results._

@Singleton
class HabitController @Inject()(
  val controllerComponents: ControllerComponents,
  habitServices:HabitServices
)(using ExecutionContext) extends BaseController with I18nSupport {

  def add = Action.async { implicit request =>
    habitForm
    .bindFromRequest()
    .fold(
      error => HABIT_BAD_REQUEST(error.errorsAsJson),
      habit => habitServices.add ( habit )
    )
  }

  def getAll = Action.async { implicit request =>
    habitServices.getAll
  }

  def getToday = Action.async { implicit request =>
    habitServices.getByDate(new Date())
  }

  def updateById = Action(parse.json).async { implicit request =>
    (request.body \ "id").validate[UUID]
    .fold(
      error => HABIT_BAD_REQUEST(Json.obj("message"->error.toString())),
      id => habitServices.updateTodaysHabitById(id)
    )
  }

}
