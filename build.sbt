ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

lazy val root = (project in file("."))
  .settings(
    name := "ScalaPractice"
  )

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.17",
  "org.scalatest" %% "scalatest-funsuite" % "3.2.17" % "test",
  "org.scalatest" %% "scalatest-funspec" % "3.2.17" % "test",
  "org.scalatest" %% "scalatest-wordspec" % "3.2.17" % "test"

)