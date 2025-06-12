package controllers.swagger

import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.enums.ParameterIn
import io.swagger.v3.oas.annotations.responses.{ApiResponse, ApiResponses}
import io.swagger.v3.oas.annotations.tags.Tag
import io.swagger.v3.oas.annotations.Parameter

import jakarta.ws.rs._
import jakarta.ws.rs.core.MediaType

@Tag(name = "Book API", description = "Операції для управління книгами")
@Path("/books")
trait BookSwaggerDoc {

  @POST
  @Path("/add")
  @Consumes(Array(MediaType.MULTIPART_FORM_DATA))
  @Operation(
    summary = "Додати нову книгу",
    parameters = Array(
      new Parameter(name = "name", in = ParameterIn.QUERY, required = true),
      new Parameter(name = "author", in = ParameterIn.QUERY, required = true),
      new Parameter(name = "annotation", in = ParameterIn.QUERY, required = true),
      new Parameter(name = "genre", in = ParameterIn.QUERY, required = true),
      new Parameter(name = "publication_year", in = ParameterIn.QUERY, required = true),
      new Parameter(name = "tags", in = ParameterIn.QUERY, required = false, description = "Список тегів"),
      new Parameter(name = "image", in = ParameterIn.QUERY, required = false, description = "Зображення книги")
    )
  )
  @ApiResponses(
    Array(
      new ApiResponse(responseCode = "200", description = "Книгу додано")
    )
  )
  def addBook(): Unit = {}

  @GET
  @Path("/get")
  @Operation(
    summary = "Отримати книгу за ID",
    parameters = Array(
      new Parameter(name = "id", in = ParameterIn.QUERY, required = true)
    )
  )
  @ApiResponses(
    Array(
      new ApiResponse(responseCode = "200", description = "Книга знайдена")
    )
  )
  def getBook(): Unit = {}

  @GET
  @Path("/list")
  @Operation(
    summary = "Отримати список книг з фільтрами",
    parameters = Array(
      new Parameter(name = "name", in = ParameterIn.QUERY),
      new Parameter(name = "genre", in = ParameterIn.QUERY),
      new Parameter(name = "author", in = ParameterIn.QUERY),
      new Parameter(name = "tags", in = ParameterIn.QUERY),
      new Parameter(name = "limit", in = ParameterIn.QUERY, required = true),
      new Parameter(name = "offset", in = ParameterIn.QUERY, required = true)
    )
  )
  @ApiResponses(
    Array(
      new ApiResponse(responseCode = "200", description = "Список книг")
    )
  )
  def listBooks(): Unit = {}

  @POST
  @Path("/delete")
  @Operation(
    summary = "Видалити книгу за ID",
    parameters = Array(
      new Parameter(name = "id", in = ParameterIn.QUERY, required = true)
    )
  )
  @ApiResponses(
    Array(
      new ApiResponse(responseCode = "200", description = "Книга видалена")
    )
  )
  def deleteBook(): Unit = {}
}
