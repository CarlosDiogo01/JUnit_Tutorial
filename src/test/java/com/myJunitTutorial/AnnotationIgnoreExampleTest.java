package com.myJunitTutorial;

import org.junit.Test;

import static org.junit.Assert.*;
import org.junit.Ignore;

public class AnnotationIgnoreExampleTest {
	
	@Ignore("Test Not Ready | BankAccount class not implemented yet") 
	@Test
	public void testMethodX() {
		//BankAccount ba = new BankAccount();
		//assertTrue(accountIsValid(ba));
		
		System.out.println("This is the test for MethodX");
	}
	
	@Test
	public void testMethodY() {
		
		String astring="";
		assertNotNull(astring);

		System.out.println("This is a dummy test for MethodY");
	}

}
