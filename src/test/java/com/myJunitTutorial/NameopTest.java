package com.myJunitTutorial;

import static org.junit.Assert.*;
import org.junit.Test;

public class NameopTest {
	
	Nameop n = new Nameop("Carlos");

	@Test	// This one will succeed
	public void testAppendsLastName() {
				 // (expected value, actual value)
		assertEquals("Carlos Sa", n.appendsLastName("Sa"));
	}
	
	@Test	// This test will fail
	public void testAppendsLastNameFail() {
		assertEquals("random string", n.appendsLastName("Sa"));
	}
	
	// (... many more tests ...)
}
