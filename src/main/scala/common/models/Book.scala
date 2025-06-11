package common.models

import common.types.{Annotation, Genre}

import java.util.UUID

case class Book(
    id: UUID,
    name: String,
    author: String,
    pYear: Int,
    image: String,
    genre: Genre,
    annotation: Annotation
)
