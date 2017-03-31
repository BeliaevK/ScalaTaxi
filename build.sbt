name := "ScalaTaxi"

version := "1.0"

resolvers += "spray" at "http://repo.spray.io/"

libraryDependencies += "org.scream3r" % "jssc" % "2.8.0"

libraryDependencies += "com.typesafe" % "config" % "1.2.1"

libraryDependencies += "com.gettyimages" % "spray-swagger_2.11" % "0.5.1"

libraryDependencies += "com.typesafe.akka" % "akka-actor_2.11" % "2.3.12"

libraryDependencies += "com.typesafe.akka" % "akka-remote_2.11" % "2.3.12"

libraryDependencies += "com.typesafe.akka" % "akka-slf4j_2.11" % "2.3.12"