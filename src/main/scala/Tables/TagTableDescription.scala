package Tables

import common.models.TagObject
import common.types.TagVal

import java.util.UUID
import slick.jdbc.PostgresProfile.api._

trait TagTableDescription {

  class TagTable(tagTable: Tag) extends Table[TagObject](tagTable, "t_tag") {
    def id = column[UUID]("id", O.PrimaryKey)

    def tag = column[TagVal]("tag", O.SqlType("Text"))

    def * = (id, tag).mapTo[TagObject]
  }

  lazy val tagTable = TableQuery[TagTable]
}
