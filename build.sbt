ThisBuild / tlBaseVersion := "0.1"

ThisBuild / organization := "com.dwolla"
ThisBuild / organizationName := "Dwolla"
ThisBuild / startYear := Some(2022)
ThisBuild / licenses := Seq(License.MIT)
ThisBuild / developers := List(
  tlGitHubDev("bpholt", "Brian Holt")
)

val Scala213 = "2.13.16"
ThisBuild / crossScalaVersions := Seq(Scala213, "2.12.20", "3.3.6")
ThisBuild / scalaVersion := Scala213 // the default Scala
ThisBuild / githubWorkflowScalaVersions := Seq("2.13", "2.12", "3")
ThisBuild / githubWorkflowJavaVersions := Seq(JavaSpec.temurin("21"))
ThisBuild / tlJdkRelease := Some(8)
ThisBuild / tlCiReleaseBranches := Seq("main")
ThisBuild / mergifyStewardConfig ~= { _.map {
  _.withAuthor("dwolla-oss-scala-steward[bot]")
    .withMergeMinors(true)
}}

lazy val `scala2-notgiven-compat-root` = tlCrossRootProject.aggregate(
  `scala2-notgiven-compat`,
)

lazy val `scala2-notgiven-compat` = crossProject(JVMPlatform, JSPlatform, NativePlatform)
  .crossType(CrossType.Pure)
  .in(file("scala2NotGiven"))
  .settings(
    libraryDependencies ++= Seq(
      "org.scala-lang.modules" %% "scala-collection-compat" % "2.13.0",
    ),
  )
