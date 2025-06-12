package Tables

import common.models.BookTagsMapper
import slick.jdbc.PostgresProfile.api._

import java.util.UUID

trait BookTagsTableDescription {
  class BookTagsTable(tagTable: Tag) extends Table[BookTagsMapper](tagTable, "t_book_tags") {
    def bookId = column[UUID]("id", O.PrimaryKey)

    def tagId = column[UUID]("name")

    def * = (bookId, tagId).mapTo[BookTagsMapper]
  }

  lazy val bookTagsTable = TableQuery[BookTagsTable]
}
