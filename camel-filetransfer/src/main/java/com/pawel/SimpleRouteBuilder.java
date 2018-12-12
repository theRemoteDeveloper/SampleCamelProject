package com.pawel;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;

public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:/Users/Pawel/Desktop/inputFolder")
		.log(LoggingLevel.INFO, "Transfering file: ${file:name}")
		.to("file:/Users/Pawel/Desktop/outputFolder");
	}

}
