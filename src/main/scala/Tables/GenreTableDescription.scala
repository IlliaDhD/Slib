package Tables
import common.models.GenreObject
import common.types.Genre
import slick.jdbc.PostgresProfile.api._

import java.util.UUID

trait GenreTableDescription {

  class GenreTable(tagTable: Tag) extends Table[GenreObject](tagTable, "t_genre") {
    def id = column[UUID]("id", O.PrimaryKey)

    def genre = column[Genre]("name", O.SqlType("Text"))

    def * = (id, genre).mapTo[GenreObject]
  }

  lazy val genreTable = TableQuery[GenreTable]
}
