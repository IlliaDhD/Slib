package common.controllers

import akka.http.scaladsl.server.Directives.rejectEmptyResponse
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.server.Directives.{complete, onSuccess}
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpplayjson.PlayJsonSupport._
import play.api.libs.json.Writes

import scala.concurrent.Future
import scala.language.implicitConversions

trait Controller {
  implicit def futureToResponse[T: Writes](future: Future[T]): Route =
    onSuccess(future)(result => complete(result))

  implicit def futureOptionToResponse[T: Writes](future: Future[Option[T]]): Route =
    onSuccess(future)(result => rejectEmptyResponse(complete(result)))

  implicit def futureUnitToResponse(future: Future[Unit]): Route =
    onSuccess(future)(complete(StatusCodes.NoContent))

  def routes: Route
}
