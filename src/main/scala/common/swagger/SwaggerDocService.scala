package common.swagger


import com.github.swagger.akka.SwaggerHttpService
import com.github.swagger.akka.model.Info
import controllers.swagger.BookSwaggerDoc

class SwaggerDocService extends SwaggerHttpService {
  override val apiClasses = Set(classOf[BookSwaggerDoc])
  override val host       = "localhost:8080"
  override val basePath   = "/"
  override val info       = Info(version = "1.0", title = "Book API")
}
