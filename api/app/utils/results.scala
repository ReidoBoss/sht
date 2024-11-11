package utils.results

import play.api.mvc.Results._
import play.api.libs.json._

private def makeResult( result: Status, json:Option[JsValue] = None) = {
  json match {
    case Some(js) =>  result(js)
    case None => result
  }
}


val ADD_HABIT = makeResult(Created)
val HABIT_ALREADY_EXIST = makeResult(
  Created,
  Some(Json.obj("message"->"Habit already exist"))
)
val ADD_HABIT_FAILED = makeResult(
  Conflict,
  Some(Json.obj("message" -> "Adding a habit failed"))
)
