import com.typesafe.sbt.packager.docker.Cmd

dockerBaseImage := "adoptopenjdk/openjdk11:ubuntu-jre"
dockerExposedPorts += 8080
dockerUpdateLatest   := true
dockerLabels         := Map("latest" -> version.value)
dockerExposedVolumes := Seq("/opt/docker/volumes")
Universal / mappings ++= {
  val base     = (baseDirectory.value / "utils" / "images").getAbsoluteFile
  val allFiles = (base ** "*").get.filter(_.isFile)
  allFiles.map(file => file -> ("images/" + IO.relativize(base, file).get))
}
dockerCommands := dockerCommands.value.flatMap {
  case cmd @ Cmd("EXPOSE", "8080") => cmd :: createImagesFolder
  case other                       => List(other)
}

val createImagesFolder =
  List(
    Cmd("RUN", "mkdir", "-p", "/opt/docker/images"),
    Cmd("RUN", "chown", "-R", "demiourgos728:root", "/opt/docker/images")
  )

