name := """akka-demy-db"""

version := "1.0"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
  // Uncomment to use Akka
  "com.typesafe.akka" %% "akka-actor" % "2.5.3",
  "com.typesafe.akka" %% "akka-testkit" % "2.5.3" % "test",
  "junit"             % "junit"           % "4.12"  % "test",
  "com.novocode"      % "junit-interface" % "0.11"  % "test"
)