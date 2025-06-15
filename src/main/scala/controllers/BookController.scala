package controllers

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import common.controllers.Controller
import common.types.{Genre, TagVal}
import services.BookService

import java.util.UUID

class BookController(bookService: BookService) extends Controller {

  override def routes: Route = pathPrefix("books")(addBook() ~ deleteBook() ~ getBook() ~ listBooks())

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
          fileUpload("image") { case (info, image) =>
            bookService.addBook(name, author, annotation, genre, image, info.fileName, year, tags.toList)
          }
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
          "tags".as[TagVal].repeated,
          "limit".as[Int],
          "offset".as[Int]
        )((name, genre, author, tags, limit, offset) =>
          bookService.listBooks(name, genre, author, tags.toList, limit, offset)
        )
      }
    }

  def deleteBook(): Route =
    path("delete") {
      post {
        parameters("id".as[UUID])(id => bookService.deleteBook(id))
      }
    }
}
