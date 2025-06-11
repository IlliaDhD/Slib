package Tables

import common.models.BookDB
import java.util.UUID
import slick.jdbc.PostgresProfile.api._

trait BookTableDescription {

  class BookTable(tag: Tag) extends Table[BookDB](tag, "t_book") {
    def id = column[UUID]("id", O.PrimaryKey)

    def name = column[String]("name")

    def authorId = column[UUID]("author")

    def genreId = column[UUID]("tagId")

    def annotation = column[String]("annotation")

    def year = column[Int]("year")

    def image = column[String]("image")

    def * =
      (id, name, authorId, year, image, genreId, annotation).mapTo[BookDB]
  }

  lazy val bookTable = TableQuery[BookTable]
}
