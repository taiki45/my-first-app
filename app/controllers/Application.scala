package controllers

//import play.api._
import play.api.mvc._

import play.api.libs.json.Json

case class Message(value: String)

object Application extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  implicit val messageWriter = Json.writes[Message]

  def hello = Action {
    val message = Message("200 OK")
    Ok(Json.toJson(message))
  }
}