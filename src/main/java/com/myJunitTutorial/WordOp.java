package com.myJunitTutorial;

public class WordOp {
	
	/* Methods */
	public String wordCountInAString(String s) {
	
		String[] words = s.split("\\s+");
		
	return Integer.toString(words.length);
	}
}
