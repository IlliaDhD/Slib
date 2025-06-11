package Server

import com.typesafe.config.{Config, ConfigFactory}
import common.ProjectDatabase


trait Modules {

  lazy val config: Config = ConfigFactory.load()
  import com.softwaremill.macwire._

  lazy val projectDatabase: ProjectDatabase = wire[ProjectDatabase]

}
