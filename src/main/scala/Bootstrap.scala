import Server.Modules

object Bootstrap extends Modules {

  scribe.info("Migrating database")
  projectDatabase.migrate()
  scribe.debug("Migration succeeded!")

}
