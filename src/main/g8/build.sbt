// give the user a nice default project!

// https://github.com/lift/framework#readme
seq(webSettings :_*)

libraryDependencies ++= {
    val liftVersion = "2.4-M4"
    Seq(
      "net.liftweb" %% "lift-webkit" % liftVersion % "compile",
      "org.mortbay.jetty" % "jetty" % "6.1.22" % "container",
      "ch.qos.logback" % "logback-classic" % "0.9.26"
    )
}



// apparently not needed for sbt 0.10+, was a remnant sbt 0.7+.  Leaving here for posterity.
// Lifty = Lift scaffolding sbt plugin (http://lifty.github.com)
//seq( Lifty.liftySettings : _*)

