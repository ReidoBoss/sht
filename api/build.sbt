name := """simple-habit-tracker"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "3.3.1"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "7.0.1" % Test
libraryDependencies += "org.playframework" %% "play-slick" % "6.1.1"
libraryDependencies += "org.playframework" %% "play-slick-evolutions" % "6.1.1"
libraryDependencies += "org.postgresql" % "postgresql" % "42.7.4"
