package com.myJunitTutorial;

import static org.junit.Assert.*;

import java.util.Arrays;
import org.junit.Test;

// Step 1
import org.junit.runner.RunWith;
import java.util.Collection;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class WordOpParameterizedTest {

	WordOp word = new WordOp();
	
	// Step 3
	private String inputs;
	private String outputs;
	
	public WordOpParameterizedTest(String inputs, String outputs) {
		this.inputs = inputs;
		this.outputs = outputs;
	}

	//Step 2 - Defining the parameters.
	@Parameters
	public static Collection<String[]> parametersForAssertEqualsTest() {
		String arrayOfInputOutput[][] = { {"null","0"}, 
							  			  {" ","0"},
							  			  {"42343","1"},
							  			  {" Hello World","2"}
										};
	return Arrays.asList(arrayOfInputOutput);
	}
	
	// Step 4
	// Now we have only a single test with all necessary parameters for testing
	@Test
	public void testWordCountInAString() {
		assertEquals(outputs,word.wordCountInAString(inputs));
	}
}	
