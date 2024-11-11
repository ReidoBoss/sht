package controllers

import javax.inject._
import play.api._
import play.api.mvc._
import play.api.libs.json._

@Singleton
class HabitController @Inject()(val controllerComponents: ControllerComponents) extends BaseController {

  def add = Action { implicit request: Request[AnyContent] =>
   ???
  }
}
