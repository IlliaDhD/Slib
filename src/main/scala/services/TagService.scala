package services

import DAOs.{BookTagsMapperDAO, TagDAO}
import common.models.TagObject
import common.types.TagVal

import java.util.UUID
import scala.concurrent.{ExecutionContext, Future}

class TagService(tagDAO: TagDAO, bookTagsMapperDAO: BookTagsMapperDAO)(implicit ec: ExecutionContext) {

  def addTags(bookId: UUID, tags: List[TagVal]): Future[Unit] =
    for {
      existingTags <- tagDAO.getTags(tags)
      newTags       = tags.filterNot(tag => existingTags.map(_.tag).contains(tag)).map(TagObject(UUID.randomUUID(), _))
      _            <- tagDAO.addTags(newTags)
      mappedIds     = existingTags.map(_.id) ++ newTags.map(_.id)
      result       <- bookTagsMapperDAO.addMapping(bookId, mappedIds.toList)
    } yield result
}
