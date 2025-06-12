package Server

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import com.typesafe.config.Config

import scala.concurrent.Future

class Server(config: Config, api: REST)(implicit val system: ActorSystem) {

  private val host: String = config.getString("server.host")
  private val port: Int    = config.getInt("server.port")

  def start(): Future[Http.ServerBinding] = {
    scribe.info(s"Backend server started at $host:$port")
    Http().newServerAt(host, port).bindFlow(api.routes)
  }
}
