
resolvers += "Web plugin repo" at "http://siasia.github.com/maven2"

libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.11"))



// Lift dependency
// https://github.com/lift/framework#readme
// https://github.com/lift-stack/xsbt-web-plugin (use v+"-0.2.11", not 0.2.7)
libraryDependencies <+= sbtVersion(v => "com.github.siasia" %% "xsbt-web-plugin" % (v+"-0.2.11"))

// Lifty = Lift scaffolding sbt plugin (http://lifty.github.com)
resolvers += Resolver.url("sbt-plugin-releases", new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/"))(Resolver.ivyStylePatterns)

// More Lifty (directives must be separated by blank line)
addSbtPlugin("org.lifty" % "lifty" % "1.7.4")
