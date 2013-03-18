A collection of Virgo related examples
======================================

This repository contains a collection of OSGi projects developed with Virgo.

Virgo Examples - RAP helloworld packaged as WAB (web application bundle)
------------------------------------------------------------------------

Build com.eclipsesource.examples.virgo.rap.webbundle:

cd com.eclipsesource.examples.virgo.parent
mvn package

Then copy the generated webbundle from the Maven build folder target into the
Virgo pickup folder.

Once deployed the sample is available at:
http://localhost:8080/helloworld/hello

For more information please refer to the RAP on Virgo tutorial:
"Developing Web Application Bundles with RAP and Virgo"
at http://eclipsesource.com/blogs/tutorials/developing-web-application-bundles-with-rap-and-virgo/

