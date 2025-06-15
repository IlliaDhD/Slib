import Server.Modules

object Bootstrap extends Modules with App {
  scribe.info("Migrating database")
  projectDatabase.migrate()
  scribe.info("Migration succeeded!")

  scribe.info("Starting a server")
  server.start()
}
