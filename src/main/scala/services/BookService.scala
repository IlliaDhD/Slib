package services

import DAOs.{AuthorDAO, BookDAO, BookTagsMapperDAO, GenreDAO}
import akka.stream.Materializer
import akka.util.ByteString
import akka.stream.scaladsl.{FileIO, Source}
import common.models.{Book, BookDB}
import common.types.{Genre, TagVal}

import java.nio.file.Path
import java.util.UUID
import scala.concurrent.{ExecutionContext, Future}

class BookService(
    bookDAO: BookDAO,
    authorDAO: AuthorDAO,
    genreDAO: GenreDAO,
    tagService: TagService,
    bookTagsMapperDAO: BookTagsMapperDAO
)(implicit ec: ExecutionContext, materializer: Materializer) {

  private val imageFolder = "images"

  def addBook(
      name: String,
      author: String,
      annotation: String,
      genre: Genre,
      image: Source[ByteString, Any],
      imageName: String,
      year: Int,
      tags: List[TagVal]
  ): Future[Unit] = {
    val bookId = UUID.randomUUID()
    for {
      optAuthorID <- authorDAO.getAuthor(author)
      authorID     = optAuthorID.getOrElse(UUID.randomUUID())
      optGenreId  <- genreDAO.getGenre(genre)
      genreId      = optGenreId.getOrElse(UUID.randomUUID())
      path        <- saveImage(imageName, image)
      _           <- tagService.addTags(bookId, tags)
      newBook      = BookDB(bookId, name, authorID, year, path.toString, genreId, annotation)
      result      <- bookDAO.addBook(newBook)
      if optAuthorID.isEmpty
      _ <- authorDAO.addAuthor(authorID, author)
      if optGenreId.isEmpty
      _ <- genreDAO.addGenre(genreId, genre)
    } yield result
  }

  def deleteBook(id: UUID): Future[Unit] =
    for {
      _      <- bookTagsMapperDAO.deleteMappings(id)
      result <- bookDAO.deleteBook(id)
    } yield result

  def getBook(id: UUID): Future[Book] = bookDAO.getBook(id)

  def listBooks(
      name: Option[String],
      genre: Option[Genre],
      author: Option[String],
      tags: List[TagVal],
      limit: Int,
      offset: Int
  ): Future[List[Book]] = bookDAO.listBooks(name, genre, author, tags, limit, offset)

  private def saveImage(name: String, image: Source[ByteString, Any]): Future[Path] = {
    val path = Path.of(imageFolder + "/" + name)
    for (_ <- image.runWith(FileIO.toPath(path))) yield path
  }
}
