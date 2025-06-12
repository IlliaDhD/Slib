package DAOs

import Tables.GenreTableDescription
import common.models.GenreObject
import common.types.Genre
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.{ExecutionContext, Future}
import java.util.UUID

class GenreDAO(val dbConfig: DatabaseConfig[_ <: JdbcProfile])(private implicit val ec: ExecutionContext)
    extends GenreTableDescription {

  def addGenre(id: UUID, genre: Genre): Future[Unit] =
    dbConfig.db.run(genreTable += GenreObject(id, genre)).map(_ => ())

  def getGenre(genre: Genre): Future[Option[UUID]] =
    dbConfig.db.run(genreTable.filter(_.genre === genre).map(_.id).result.headOption)
}
