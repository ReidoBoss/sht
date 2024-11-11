package utils.results

import play.api.mvc.Results._
import play.api.libs.json._
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
private def makeResult( result: Status, json:Option[JsValue] = None) = {
  json match {
    case Some(js) =>  result(js)
    case None => result
  }
}


val ADD_HABIT = makeResult(Created)

def HABIT_RETRIEVE(json:JsValue) = makeResult( Ok, Some(json) )

val HABIT_ALREADY_EXIST = makeResult(
  Created,
  Some(Json.obj("message"->"Habit already exist"))
)

val ADD_HABIT_FAILED = makeResult(
  Conflict,
  Some(Json.obj("message" -> "Adding a habit failed"))
)

val GET_HABIT_FAILED = makeResult(
  Conflict,
  Some(Json.obj("message" -> "Getting habit failed"))
)

def HABIT_BAD_REQUEST(json:JsValue) = Future(
  makeResult(
    BadRequest,
    Some(json)
  )
)
