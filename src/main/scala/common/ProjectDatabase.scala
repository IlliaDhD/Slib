package common

import com.typesafe.config.Config
import org.flywaydb.core.Flyway
import org.flywaydb.core.api.output.MigrateResult
import slick.basic.DatabaseConfig
import slick.jdbc.PostgresProfile
import slick.jdbc.PostgresProfile.api._

import scala.concurrent.Future

case class ProjectDatabase(config: Config) {
  private val url           = config.getString("db.url")
  private val dbUser        = config.getString("db.user")
  private val userPassword  = config.getString("db.password")
  private val migrationPath = config.getString("db.migrationPath")

  val db       = Database.forConfig("db", config)
  val provider = DatabaseConfig.forConfig[PostgresProfile]("db", config)
  private lazy val flyway =
    Flyway
      .configure()
      .dataSource(url, dbUser, userPassword)
      .locations(migrationPath)
      .load()

  def migrate(): MigrateResult = flyway.migrate()

  def shutdown(): Future[Unit] = db.shutdown
}
