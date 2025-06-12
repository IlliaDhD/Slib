package common.controllers

import common.swagger.SwaggerDocService
import java.nio.file.{Files, Paths}
import java.nio.charset.StandardCharsets

object SwaggerGenerator extends App {
  private val service = new SwaggerDocService()
  val json            = service.generateSwaggerJson

  Files.write(Paths.get("docs/swagger.json"), json.getBytes(StandardCharsets.UTF_8))
}
