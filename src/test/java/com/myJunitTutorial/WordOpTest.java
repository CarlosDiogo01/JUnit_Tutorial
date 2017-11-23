package com.myJunitTutorial;

import static org.junit.Assert.*;

import org.junit.Test;

public class WordOpTest {

	WordOp word = new WordOp();
	
	
	/* The following tests should be Parameterized!! */
	@Test
	public void testWordCountInAString_NullString() {
		assertEquals("0",word.wordCountInAString("null"));
	}
	
	@Test
	public void testWordCountInAString_Space() {
		assertEquals("0",word.wordCountInAString(" "));
	}
	
	@Test
	public void testWordCountInAString_Numbers() {
		assertEquals("1",word.wordCountInAString("42343"));
	}
	
	@Test
	public void testWordCountInAString_TwoWords() {
		assertEquals("2",word.wordCountInAString(" Hello World"));
	}
	
	// (....)
}	

