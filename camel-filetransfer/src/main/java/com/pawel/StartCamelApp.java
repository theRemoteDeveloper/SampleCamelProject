package com.pawel;

import org.apache.camel.CamelContext;
import org.apache.camel.impl.DefaultCamelContext;

public class StartCamelApp {

	public static void main(String[] args) {
		SimpleRouteBuilder simpleRouteBuilder = new SimpleRouteBuilder();
		CamelContext camelContext = new DefaultCamelContext();
		try {
			camelContext.addRoutes(simpleRouteBuilder);
			camelContext.start();
			Thread.sleep(1 * 60 * 1000);
			camelContext.stop();
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
