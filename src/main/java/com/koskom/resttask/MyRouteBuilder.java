package com.koskom.resttask;

import com.koskom.utils.Utils;
import org.apache.camel.builder.RouteBuilder;

class MyRouteBuilder extends RouteBuilder {

    public void configure() {

        from("jetty://http://localhost:8080/stat")
                .log("Received a request")
                .setBody(simple(Utils.getArtifactId()));

    }
}
