import com.typesafe.config.ConfigFactory
import common.ProjectDatabase

object Main {
  def main(args: Array[String]): Unit = {
    val config = ConfigFactory.load()
    val db     = ProjectDatabase(config)
    scribe.info("Migrating database")
    db.migrate()
    scribe.debug("Migration succeeded!")

  }
}
