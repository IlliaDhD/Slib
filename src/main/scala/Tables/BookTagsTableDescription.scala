package Tables

import common.models.BookTagsRelation
import slick.jdbc.PostgresProfile.api._

import java.util.UUID

trait BookTagsTableDescription {
  class GenreTable(tagTable: Tag) extends Table[BookTagsRelation](tagTable, "t_book_tags") {
    def bookId = column[UUID]("id", O.PrimaryKey)

    def tagId = column[UUID]("name")

    def * = (bookId, tagId).mapTo[BookTagsRelation]
  }

  lazy val tagTable = TableQuery[GenreTable]
}
