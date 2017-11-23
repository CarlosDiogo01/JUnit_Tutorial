package com.myJunitTutorial;

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import java.util.Arrays;


public class CompareArraysTest {
	
	/* Aux methods for tests */
	public void mySortMethod (String[] array) {
		// array not sorted
		Arrays.sort(array);
		// array sorted
		
		String temp="";
		temp = array[2];
		array[2] = array[3];
		array[3] = temp;
		// array incorrectly sorted
	}
	
	@Test
	public void testOrderedByName() {
		String[] names = {"Charlie","Patty","Joe","Anthony","Bernard"};
		String[] expectedResult = {"Anthony","Bernard","Charlie","Joe","Patty"};
		
		//Arrays.sort(names);	// this method sort correctly
		mySortMethod(names);	// this method does not sort correctly
		String[] atualSortingResult = names;

						//(expected_array, actual_array)
		assertArrayEquals(expectedResult, atualSortingResult);	//not inlined to make things simpler
	}
}
