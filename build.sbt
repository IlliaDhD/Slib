lazy val root = (project in file("."))
  .enablePlugins(DockerPlugin, JavaServerAppPackaging, GitVersioning)
  .settings(
    name              := "Slib",
    scalaVersion      := "2.13.16",
    semanticdbEnabled := true,
    libraryDependencies ++= Dependencies.libraries,
    git.useGitDescribe := true,
    git.baseVersion    := "0.0.0",
    git.gitTagToVersionNumber := { tag: String =>
      if (tag matches "([0-9]+\\\\.[0-9]+\\\\.[0-9]+)") Some(tag)
      else None
    },
    scalacOptions ++= Options.options,
    fork                     := true,
    Test / parallelExecution := false
  )
