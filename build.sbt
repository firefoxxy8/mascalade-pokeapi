name := """mascalade-pokeapi"""

version := "1.0"

scalaVersion := "2.11.7"

// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.json4s" %% "json4s-native" % "3.2.11",
  "org.specs2" %% "specs2-core" % "3.6.4" % "test",
  "org.scalaj" %% "scalaj-http" % "1.1.5"
)

// Uncomment to use Akka
//libraryDependencies += "com.typesafe.akka" %% "akka-actor" % "2.3.11"

scalacOptions in Test ++= Seq("-Yrangepos")