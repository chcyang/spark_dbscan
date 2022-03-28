name := "spark_dbscan"

organization := "org.alitouka"

version := "0.0.4"

scalaVersion := "2.11.8"

resolvers ++= Seq(
  "apache-snapshots" at "http://repository.apache.org/snapshots/"
)

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.3.1" % "provided"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.1.4" % Test

libraryDependencies += "org.apache.commons" % "commons-math3" % "3.6.1"

libraryDependencies += "com.github.scopt" %% "scopt" % "4.0.1"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

test in assembly := {}