package com.pawel.test;

import java.io.File;

import org.apache.camel.RoutesBuilder;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

import com.pawel.SimpleRouteBuilder;

public class SimpleRouteBuilderTest extends CamelTestSupport {
	
	protected RoutesBuilder createRouteBuilder() {
		return new SimpleRouteBuilder();
	}

	@Test
	public void checkInputDirectoryTest() {
		File file = new File("/Users/Pawel/Desktop/inputFolder");
		assertTrue(file.isDirectory());
	}
	
	@Test
	public void checkOutputDirectoryTest() {
		File file = new File("/Users/Pawel/Desktop/outputFolder");
		assertTrue(file.isDirectory());
	}
	
}
