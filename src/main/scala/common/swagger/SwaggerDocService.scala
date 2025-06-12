package common.swagger

import com.github.swagger.akka.SwaggerHttpService
import com.github.swagger.akka.model.Info
import controllers.swagger.BookSwaggerDoc

class SwaggerDocService extends SwaggerHttpService {
  override val apiClasses: Set[Class[_]] = Set(classOf[BookSwaggerDoc])
  override val host                      = "localhost:8080"
  override val basePath                  = "/docs"
  override val info: Info                = Info(version = "1.0", title = "Book API")
}
