object Options {
  val options: Seq[String] = Seq(
    "-feature",
    "-Ywarn-value-discard",
    "-Ywarn-dead-code",
    "-Ywarn-unused",
    "-language:postfixOps",
    "-deprecation",
    "-Yrangepos"
  )
}
