package common.models

import common.types.TagVal

import java.util.UUID

case class TagObject(
    id: UUID,
    tag: TagVal
)
