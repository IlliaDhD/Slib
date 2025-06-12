package Server

import akka.http.scaladsl.server.Directives.handleRejections
import akka.http.scaladsl.server.{RejectionHandler, Route}
import ch.megard.akka.http.cors.scaladsl.CorsDirectives.{cors, corsRejectionHandler}
import common.controllers.Controller
import controllers.BookController

class REST(bookController: BookController) extends Controller {

  private val rejectionHandler = handleRejections(RejectionHandler.default)

  override def routes: Route = handleRejections(corsRejectionHandler) {
    cors()(rejectionHandler(bookController.routes))
  }
}
