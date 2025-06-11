package common.models

import common.types.Annotation

import java.util.UUID

case class BookDB(
    id: UUID,
    name: String,
    authorId: UUID,
    year: Int,
    image: String,
    genreId: UUID,
    annotation: Annotation
)
