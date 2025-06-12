package controllers

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import common.controllers.Controller
import common.types.{Genre, TagVal}

import java.util.UUID

class BookController(bookService: BookService) extends Controller {

  override def routes: Route = pathPrefix("books")(addBook ~ deleteBook())

  def addBook(): Route =
    path("add") {
      post {
        parameters(
          "name".as[String],
          "author".as[String],
          "annotation".as[String],
          "genre".as[Genre],
          "publication_year".as[Int],
          "tags".as[TagVal].repeated
        ) { (name, author, annotation, genre, year, tags) =>
          fileUpload("image") { case (_, image) => bookService.addBook(name, author, annotation, genre, image, year, tags) }
        }
      }
    }

  def getBook(): Route =
    get {
      parameters(
        "id".as[UUID]
      )(id => bookService.getBook(id))
    }

  def listBooks(): Route =
    path("list") {
      get {
        parameters(
          "name".as[String].?,
          "genre".as[Genre].?,
          "author".as[String].?,
          "tags".as[TagVal].repeated
        )((name, genre, author, tags) => bookService.listBooks(name, genre, author, tags))
      }
    }

  def deleteBook(): Route = {
    path("delete") {
      post {
        parameters("id".as[UUID])(id => bookService.deleteBook(id))
      }
    }
  }
}