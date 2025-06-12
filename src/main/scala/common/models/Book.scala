package common.models

import common.types.Genre
import play.api.libs.json.{Json, OFormat}

import java.util.UUID

case class Book(
    id: UUID,
    name: String,
    author: String,
    pYear: Int,
    image: String,
    genre: Genre,
    annotation: String
)

object Book {
  implicit val jsonFormat: OFormat[Book] = Json.format[Book]
}
