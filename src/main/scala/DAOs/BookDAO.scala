package DAOs

import Tables.{AuthorTableDescription, BookTableDescription, GenreTableDescription}
import common.models.{Book, BookDB}
import common.types.{Genre, TagVal}
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.PostgresProfile.api._

import java.util.UUID
import scala.concurrent.{ExecutionContext, Future}

class BookDAO(val dbConfig: DatabaseConfig[_ <: JdbcProfile])(private implicit val ec: ExecutionContext)
    extends BookTableDescription
    with GenreTableDescription
    with AuthorTableDescription {

  def addBook(
      book: BookDB
  ): Future[Unit] = dbConfig.db.run(bookTable += book).map(_ => ())

  def deleteBook(id: UUID): Future[Unit] = dbConfig.db.run(bookTable.filter(_.id === id).delete).map(_ => ())

  def getBook(id: UUID): Future[Book] =
    dbConfig.db
      .run(
        createBook()
          .filter(_._1.id === id)
          .result.head
      ).map { case (bookDb, genre, authorName) =>
        Book(bookDb.id, bookDb.name, authorName, bookDb.year, bookDb.image, genre, bookDb.annotation)
      }

  def listBooks(
      name: Option[String],
      genre: Option[Genre],
      author: Option[String],
      tags: List[TagVal],
      limit: Int,
      offset: Int
  ): Future[List[Book]] =
    dbConfig.db
      .run(
        createBook()
          .filterOpt(name)(_._1.name === _).filterOpt(genre)(_._2 === _).filterOpt(author)(_._3 === _).drop(offset).take(
            limit
          ).result
      ).map { seq =>
        seq.map { case (bookDb, genre, authorName) =>
          Book(bookDb.id, bookDb.name, authorName, bookDb.year, bookDb.image, genre, bookDb.annotation)
        }.toList
      }

  private def createBook(): Query[(BookTable, Rep[Genre], Rep[String]), (BookDB, Genre, String), Seq] = bookTable
    .join(genreTable).on(_.genreId === _.id)
    .join(authorTable).on(_._1.authorId === _.id)
    .map { case ((bookDb, genreObj), author) => (bookDb, genreObj.genre, author.name) }
}
