name := "cross-cutting-concerns"

version := "1.0"

scalaVersion := "2.12.10"

fork := true
javaOptions ++= Seq(
  s"-javaagent:${System.getProperty("user.home")}/Library/Caches/Coursier/v1/https/repo1.maven.org/maven2/org/aspectj/aspectjweaver/1.9.6/aspectjweaver-1.9.6.jar")

scalacOptions ++= Seq(
  "-unchecked",
  "-feature",
  "-language:existentials",
  "-language:higherKinds",
  "-language:implicitConversions",
  "-language:postfixOps",
  "-deprecation",
  "-encoding",
  "utf8"
)

// Add multiple dependencies
libraryDependencies ++= Seq(
  "ch.qos.logback" % "logback-classic" % "1.2.3",
  "org.slf4j" % "slf4j-api" % "1.7.30",
  "org.aspectj" % "aspectjweaver" % "1.9.6",
  "org.aspectj" % "aspectjrt" % "1.9.6"
)
