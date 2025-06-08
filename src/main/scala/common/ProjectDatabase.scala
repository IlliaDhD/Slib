package common

import com.typesafe.config.Config
import org.flywaydb.core.Flyway
import org.flywaydb.core.api.output.MigrateResult
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Future

case class ProjectDatabase(config: Config) {
  val url           = config.getString("db.url")
  val dbUser        = config.getString("db.user")
  val userPassword  = config.getString("db.password")
  val migrationPath = config.getString("db.migrationPath")

  val db = Database.forConfig("db", config)

  private lazy val flyway =
    Flyway
      .configure()
      .dataSource(url, dbUser, userPassword)
      .locations(migrationPath)
      .load()

  def migrate(): MigrateResult = flyway.migrate()

  def shutdown(): Future[Unit] = db.shutdown
}
