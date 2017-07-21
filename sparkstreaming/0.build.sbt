name := "spark-streaming-basics-home"

version := "1.0"

scalaVersion := "2.10.5"

resolvers ++= Seq("Cloudera Repository" at "https://repository.cloudera.com/artifactory/cloudera-repos/")

libraryDependencies += "org.apache.spark" %% "spark-core" % "1.6.0-cdh5.11.0" % "provided"

libraryDependencies += "org.apache.spark" %% "spark-hive" % "1.6.0-cdh5.11.0" % "provided"
//
libraryDependencies += "org.apache.spark" %% "spark-sql" % "1.6.0-cdh5.11.0" % "provided"
//
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "1.6.0-cdh5.11.0" % "provided"
//
libraryDependencies += "org.apache.spark" %% "spark-streaming-flume" % "1.6.0-cdh5.11.0" % "provided"
//
libraryDependencies += "org.apache.spark" %% "spark-streaming-flume-sink" % "1.6.0-cdh5.11.0" % "provided"
//
libraryDependencies += "org.apache.spark" %% "spark-streaming-kafka" % "1.6.0-cdh5.11.0" % "provided"
