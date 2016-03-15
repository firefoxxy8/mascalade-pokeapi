name := """mascalade-pokeapi"""

version := "1.0"

scalaVersion := "2.11.8"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.3.0",
  "org.specs2" %% "specs2-core" % "3.7.2" % "test",
  "org.scalaj" %% "scalaj-http" % "2.2.1"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

scalacOptions in Test ++= Seq("-Yrangepos")