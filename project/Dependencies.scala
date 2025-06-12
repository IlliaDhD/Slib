import sbt.*

object Dependencies {

  private object versions {
    val akka               = "2.6.20"
    val akkaHttp           = "10.2.10"
    val akkaPlayJson       = "1.39.2"
    val akkaHttpCors       = "1.2.0"
    val scalatest          = "3.2.19"
    val scalamock          = "6.0.0"
    val swagger            = "2.7.0"
    val swaggerAnnotations = "2.2.15"
    val macwire            = "2.6.4"
    val ficus              = "1.5.2"
    val enumeratum         = "1.7.5"
    val enumeratumPlayJson = "1.7.2"
    val enumeratumSlick    = "1.7.0"
    val slick              = "3.3.3"
    val slickPg            = "0.20.3"
    val postgresDriver     = "42.7.4"
    val flyway             = "9.7.0"
    val scribe             = "3.16.1"
  }

  private val testLibraries = Seq(
    "org.scalatest"     %% "scalatest"         % versions.scalatest % Test,
    "org.scalamock"     %% "scalamock"         % versions.scalamock % Test,
    "com.typesafe.akka" %% "akka-testkit"      % versions.akka      % Test,
    "com.typesafe.akka" %% "akka-http-testkit" % versions.akkaHttp  % Test
  )

  private val akkaLibraries = Seq(
    "com.typesafe.akka"            %% "akka-http"           % versions.akkaHttp,
    "de.heikoseeberger"            %% "akka-http-play-json" % versions.akkaPlayJson,
    "com.typesafe.akka"            %% "akka-stream"         % versions.akka,
    "com.typesafe.akka"            %% "akka-stream"         % versions.akka,
    "com.typesafe.akka"            %% "akka-protobuf"       % versions.akka,
    "com.github.swagger-akka-http" %% "swagger-akka-http"   % versions.swagger,
    "io.swagger.core.v3"            % "swagger-annotations" % versions.swaggerAnnotations,
    "ch.megard"                    %% "akka-http-cors"      % versions.akkaHttpCors
  )

  private val databaseLibraries = Seq(
    "org.postgresql"       % "postgresql"         % versions.postgresDriver,
    "com.typesafe.slick"  %% "slick"              % versions.slick,
    "com.typesafe.slick"  %% "slick-hikaricp"     % versions.slick,
    "org.flywaydb"         % "flyway-core"        % versions.flyway,
    "com.github.tminglei" %% "slick-pg_play-json" % versions.slickPg,
    "com.github.tminglei" %% "slick-pg"           % versions.slickPg
  )

  private val other = Seq(
    "com.iheart"               %% "ficus"                % versions.ficus,
    "com.beachape"             %% "enumeratum"           % versions.enumeratum,
    "com.beachape"             %% "enumeratum-play-json" % versions.enumeratumPlayJson,
    "com.beachape"             %% "enumeratum-slick"     % versions.enumeratumSlick,
    "com.softwaremill.macwire" %% "macros"               % versions.macwire % Provided,
    "com.softwaremill.macwire" %% "util"                 % versions.macwire,
    "com.outr"                 %% "scribe-slf4j"         % versions.scribe,
    "jakarta.ws.rs"             % "jakarta.ws.rs-api"    % "3.0.0"
  )

  val libraries: Seq[ModuleID] = testLibraries ++ akkaLibraries ++ databaseLibraries ++ other
}
