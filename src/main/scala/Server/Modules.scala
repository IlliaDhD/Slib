package Server

import DAOs.{AuthorDAO, BookDAO, BookTagsMapperDAO, GenreDAO, TagDAO}
import akka.actor.ActorSystem
import com.typesafe.config.{Config, ConfigFactory}
import common.ProjectDatabase
import controllers.BookController
import services.{BookService, TagService}
import slick.basic.DatabaseConfig
import slick.jdbc.JdbcProfile

import scala.concurrent.ExecutionContext

trait Modules {

  lazy val config: Config = ConfigFactory.load()
  import com.softwaremill.macwire._
  val dbConfig: DatabaseConfig[_ <: JdbcProfile] = projectDatabase.provider

  implicit lazy val system: ActorSystem                = ActorSystem("blacklist-service")
  implicit lazy val executionContext: ExecutionContext = system.dispatcher

  lazy val projectDatabase: ProjectDatabase = wire[ProjectDatabase]

  lazy val bookTagMapperDao: BookTagsMapperDAO = wire[BookTagsMapperDAO]
  lazy val genreDAO: GenreDAO                  = wire[GenreDAO]
  lazy val tagDao: TagDAO                      = wire[TagDAO]
  lazy val authorDao: AuthorDAO                = wire[AuthorDAO]
  lazy val bookDao: BookDAO                    = wire[BookDAO]

  lazy val bookService: BookService       = wire[BookService]
  lazy val tagService: TagService         = wire[TagService]
  lazy val bookController: BookController = wire[BookController]
  lazy val api: REST                      = wire[REST]
  lazy val server: Server                 = wire[Server]
}
