## Giter8 template for Lift 2.4, Scala 2.9, blank, html5-ready

### Quick Setup:

1.  Install [Java SDK][1] or [OpenJDK][0].
2.  Install the [Typesafe Stack][8] (Scala, sbt, giter8).
    - Multiple install options.  For \*nix users, if you choose to install via repo for your distro, a required dependency is OpenJDK.  If you already have Oracle Java installed and want to run Typesafe and Lift on that instead of OpenJDK, your best bet is to use the Unversal installer (just a zipped archive you put anywhere and add the bin directory to your PATH).
3.  Install Lift using giter8, run it with sbt and lifty:

    >`g8 lift-stack/lift24-s29-blank`
    >`cd lift24-s29-blank`
    >`sbt`
    >`lift jetty-run`

Lift will be running on localhost:9000.

### Requires:

1.  [Java SDK 6+][1] installed
2.  [Scala 2.9][2] installed \*
3.  [sbt 0.10+][3] installed and on your PATH \*
4.  [giter8][4] installed and on your PATH \*

\* #2-#3 can be easily done by installing the [Typesafe Stack][8]

### Installs:

5.  [sbt-extras][5] script 
6.  [lifty sbt plugin][6]
7.  this lift project template

### Setup:

After you've completed 1-4, simply run:

    g8 lift-stack/lift24-s29-blank
    cd lift24-s29-blank
    sbt
    lift jetty-run

Lift will be running on localhost:9000.

[0]:  http://openjdk.java.net/install/
[1]:  http://oracle.com/java 
[2]:  http://www.scala-lang.org/downloads 
[3]:  https://github.com/harrah/xsbt/ 
[4]:  https://github.com/n8han/giter8 
[5]:  https://github.com/paulp/sbt-extras
[6]:  https://github.com/Lifty/lifty 

[8]:  http://typesafe.com/stack/download 

