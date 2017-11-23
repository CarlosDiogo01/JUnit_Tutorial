package com.myJunitTutorial;

import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;


public class AnnotationBeforeAndAfterTestExample {
	
	@BeforeClass
	public static void beforeClassExample() {
		System.out.println("BEFORE CLASS" + "\n");
	}
	
	@Before
	public void beforeExample() {
		System.out.println("BEFORE");
	}
	
	@Test
	public void testExample() {
		System.out.println("This is test 1");
	}
	@Test
	public void testExample2() {
		System.out.println("This is test 2");
	}
	
	@After
	public void afterExample() {
		System.out.println("AFTER" + "\n");
	}
	
	@AfterClass
	public static void afterClassExample() {
		System.out.println("AFTER CLASS");
	}
}
