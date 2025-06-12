package DAOs

import Tables.AuthorTableDescription
import common.models.Author
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.PostgresProfile.api._

import java.util.UUID
import scala.concurrent.{ExecutionContext, Future}

class AuthorDAO(val dbConfig: DatabaseConfig[_ <: JdbcProfile])(private implicit val ec: ExecutionContext)
    extends AuthorTableDescription {
  def addAuthor(id: UUID, name: String): Future[Unit] = {
    val author = Author(id, name)
    dbConfig.db.run(authorTable += author).map(_ => ())
  }

  def getAuthor(name: String): Future[Option[UUID]] =
    dbConfig.db.run(authorTable.filter(_.name === name).map(_.id).result.headOption)
}
