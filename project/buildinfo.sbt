//Good resource (http://blog.byjean.eu/2015/07/10/painless-release-with-sbt.html)

//Plugins to help construct construct a version to be used
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.6.1")

// for autoplugins (https://github.com/sbt/sbt-native-packager - http://www.scala-sbt.org/sbt-native-packager/formats/universal.html)
addSbtPlugin("com.typesafe.sbt" % "sbt-native-packager" % "1.1.0-RC1")

// Sbt release plugin (https://github.com/sbt/sbt-release)
addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.3")