resolvers ++= Seq(
  DefaultMavenRepository,
  Resolver.typesafeRepo("releases"),
  Resolver.sonatypeRepo("public"),
  Resolver.sbtPluginRepo("releases"),
  "Flyway" at "https://flywaydb.org/repo",
  "snapshots" at "https://archiva.persgroep.digital/repository/snapshots"
)

// see also: http://www.scalastyle.org/sbt.html
addSbtPlugin("org.scalastyle" %% "scalastyle-sbt-plugin" % "1.0.0")

// Visualize your project's dependencies.
// see also: https://github.com/jrudolph/sbt-dependency-graph
// Note: sbt >= 1.3.x is currently not supported
addSbtPlugin("net.virtual-void" % "sbt-dependency-graph" % "0.10.0-RC1")

// Display your sbt project's dependency updates.
// see also: https://github.com/rtimush/sbt-updates
addSbtPlugin("com.timushev.sbt" % "sbt-updates" % "0.5.1")

// enabling a super-fast development turnaround for your Scala applications.
// features:
// - Starting and stopping your application in the background of your interactive SBT shell (in a forked JVM)
// - Triggered restart: automatically restart your application as soon as some of its sources have been changed
// see also: https://github.com/spray/sbt-revolver
addSbtPlugin("io.spray" % "sbt-revolver" % "0.9.1")

// The Cucumber plugin provides a new sbt command
// see also: https://github.com/sbt/sbt-cucumber
addSbtPlugin("com.waioeka.sbt" % "cucumber-plugin" % "0.2.1")

// SonarQube Scanner for SBT.
// see also: https://github.com/olaq/sbt-sonar-scanner-plugin
addSbtPlugin("com.olaq" % "sbt-sonar-scanner-plugin" % "1.3.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.3.1")

// sbt-scoverage is a plugin for SBT that integrates the scoverage code coverage library.
// see also: https://github.com/scoverage/sbt-scoverage
// see also: https://github.com/scoverage/scalac-scoverage-plugin
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.0")

// sbt plugin to load environment variables from .env into the JVM System Environment for local development.
// see also: https://github.com/mefellows/sbt-dotenv
addSbtPlugin("au.com.onegeek" %% "sbt-dotenv" % "2.1.146")

// SBT native packager lets you build application packages in native formats.
// see also: https://github.com/sbt/sbt-native-packager
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.7.2")
