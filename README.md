# A collection of Virgo related examples

This repository contains a collection of OSGi projects developed with Virgo:

* RAP example - packaged as Web Application Bundle
* RAP example - with OSGi integration via blueprint
* Blueprint - export embedded H2 DataSource via OSGi service
* Blueprint - consume the DataSource and provide some OSGi console commands

#### RAP helloworld packaged as Web Application Bundle (WAB)

Build com.eclipsesource.virgo.examples.rap.webbundle:

1. cd com.eclipsesource.virgo.examples.parent
1. mvn package

Copy the required RAP bundle to your virgo installation:

1. cd com.eclipsesource.virgo.examples.rap.webbundle
1. export VIRGO_HOME=enter-your-virgo-installation-directory-here
1. mvn -f virgo-setup.xml dependency:copy

Then copy the generated webbundle from the Maven build folder target into the
Virgo pickup folder.

Once deployed the sample is available at http://localhost:8080/helloworld/hello

For more information please refer to the RAP on Virgo tutorial:
"Developing Web Application Bundles with RAP and Virgo"
at http://eclipsesource.com/blogs/tutorials/developing-web-application-bundles-with-rap-and-virgo/

#### RAP helloworld with OSGi integration via blueprint

Build com.eclipsesource.virgo.examples.rap.blueprint:

1. cd com.eclipsesource.virgo.examples.parent
1. mvn package

Copy the required RAP bundle to your virgo installation:

1. cd com.eclipsesource.virgo.examples.rap.blueprint
1. export VIRGO_HOME=enter-your-virgo-installation-directory-here
1. mvn -f virgo-setup.xml dependency:copy

Extend Virgo to provide an OSGi HttpService and the RAP OSGi integration:

Do this by providing the necessary bundles in the repository/usr folder of Virgo
and then copy the rap.blueprint.plan into the Virgo pickup folder.

Necessary bundles are:

1. org.eclipse.equinox.http.servlet
1. org.eclipse.equinox.http.jetty

(Those are pre-packaged in the RAP target download or available directly from the Equinox project site.)

Then copy the generated bundle from the Maven build folder target into the
Virgo pickup folder.

Once deployed the sample is available at http://localhost:8080/helloworld/hello

For more information please refer to the RAP on Virgo tutorial:
"Developing Web Application Bundles with RAP and Virgo"
at http://eclipsesource.com/blogs/tutorials/developing-web-application-bundles-with-rap-and-virgo/

Note: Jetty and the HttpService use the same port per default. So you have to configure either the HttpService or the default Jetty configuration.

Provide org.osgi.service.http.port=18080 or change the port in jetty/etc/jetty.xml.

#### Blueprint example - OSGi building blocks

Build com.eclipsesource.examples.virgo.rap.webbundle:

1. cd com.eclipsesource.virgo.examples.parent
1. mvn package

Copy the required H2 bundle to your virgo installation:

1. cd com.eclipsesource.virgo.examples.blueprint.h2
1. export VIRGO_HOME=enter-your-virgo-installation-directory-here
1. mvn -f virgo-setup.xml dependency:copy

Then copy the generated OSGi bundles from the Maven build folders target into the Virgo pickup folder.

Now you have additional OSGi console commands.

For more information please refer to the blog post
"How to create blueprints for your OSGi building blocks"
at http://eclipsesource.com/blogs/2012/08/11/how-to-create-blueprints-for-your-osgi-building-blocks/
