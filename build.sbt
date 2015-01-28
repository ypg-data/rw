scalaVersion := "2.11.5"

// for scalaz-stream
resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies ++= Seq(

  // http://etorreborre.github.io/specs2/
  "org.specs2" %% "specs2-core" % "2.4.15" % "test",

  // http://slick.typesafe.com/doc/2.1.0/
  "com.typesafe.slick" %% "slick" % "2.1.0",

  // https://github.com/typesafehub/scala-logging
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",

  // https://github.com/scalaz/scalaz-stream
  "org.scalaz.stream" %% "scalaz-stream" % "0.6a"
)

// for specs2 macros
scalacOptions in Test += "-Yrangepos"

// bug with specs2 https://github.com/non/kind-projector/issues/7
// https://github.com/non/kind-projector
// resolvers += "bintray/non" at "http://dl.bintray.com/non/maven"
// addCompilerPlugin("org.spire-math" % "kind-projector_2.11" % "0.5.2")

scalacOptions ++= Seq(
  "-deprecation",
  "–unchecked",
  "-encoding", "UTF-8",
  "-explaintypes",
  "-feature",
  "-language:higherKinds"
  // "-language:implicitConversions",
  // "-language:existentials",
  // "-language:postfixOps",
  // "-language:experimental.macros"
)

seq(kataSettings: _*)