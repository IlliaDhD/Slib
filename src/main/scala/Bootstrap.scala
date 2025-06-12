import Server.Modules

object Bootstrap extends Modules with App {
  scribe.info("Starting a server")
  server.start()

  scribe.info("Migrating database")
  projectDatabase.migrate()
  scribe.info("Migration succeeded!")
}
