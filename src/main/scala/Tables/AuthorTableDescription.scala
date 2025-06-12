package Tables

import common.models.Author

import slick.jdbc.PostgresProfile.api._
import java.util.UUID

trait AuthorTableDescription {

  class AuthorTable(tagTable: Tag) extends Table[Author](tagTable, "t_author") {
    def id = column[UUID]("id", O.PrimaryKey)

    def name = column[String]("name")

    def * = (id, name).mapTo[Author]
  }

  lazy val authorTable = TableQuery[AuthorTable]

}
