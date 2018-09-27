lazy val root = (project in file(".")).
settings(
    name := "{{ cookiecutter.app_name }}",
    version := "0.0.1",
    scalaVersion := "{{ cookiecutter.scala_version }}",
    libraryDependencies ++= Seq(
      "org.scalactic" %% "scalactic" % "3.0.5",
      "org.scalatest" %% "scalatest" % "3.0.5" % "test",
    )
)
