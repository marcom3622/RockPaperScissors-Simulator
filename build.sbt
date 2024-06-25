ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.14"

lazy val root = (project in file("."))
  .settings(
    name := "RPSSimulator"
  )

name := "JavaFXScalaApp"

version := "0.1"

// Add library dependencies for JavaFX, specific to your OS
libraryDependencies ++= Seq(
  "org.openjfx" % "javafx-controls" % "22.0.1" classifier "win",
  "org.openjfx" % "javafx-fxml" % "22.0.1" classifier "win"
)
