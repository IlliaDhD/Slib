package DAOs

import Tables.TagTableDescription
import common.models.TagObject
import common.types.TagVal
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.{ExecutionContext, Future}

class TagDAO(val dbConfig: DatabaseConfig[_ <: JdbcProfile])(private implicit val ec: ExecutionContext)
    extends TagTableDescription {

  def getTags(tags: List[TagVal]): Future[Seq[TagObject]] =
    dbConfig.db.run(tagTable.filter(_.tag inSetBind tags).result)

  def addTags(tags: List[TagObject]): Future[Unit] =
    dbConfig.db.run(tagTable ++= tags).map(_ => ())
}
