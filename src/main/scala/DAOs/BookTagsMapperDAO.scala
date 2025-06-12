package DAOs

import Tables.BookTagsTableDescription
import common.models.BookTagsMapper
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.PostgresProfile.api._

import java.util.UUID
import scala.concurrent.{ExecutionContext, Future}

class BookTagsMapperDAO(val dbConfig: DatabaseConfig[_ <: JdbcProfile])(private implicit val ec: ExecutionContext)
    extends BookTagsTableDescription {

  def addMapping(bookId: UUID, tagIds: List[UUID]): Future[Unit] = {
    val mappers = tagIds.map(tagId => BookTagsMapper(bookId, tagId))
    dbConfig.db.run(bookTagsTable ++= mappers).map(_ => ())
  }

  def deleteMappings(bookId: UUID): Future[Unit] =
    dbConfig.db.run(bookTagsTable.filter(_.bookId === bookId).delete).map(_ => ())
}
