package com.myJunitTutorial;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

public class PerformanceTest {

	@Test(timeout=10000)
	public void testGenAndSortingLongs_ArraysSortPerformance() {
		long[] values = new long[100000000];
		Random randomNum = new Random();

		//Generating random values 
		for (int i=0; i<100000000; i++) {
			values[i] = randomNum.nextLong();
		}
		//Sorting the 'values' array 
		Arrays.sort(values);
	}
	
	@Test(timeout=10000)
	public void testGenAndSortingLongs_ArraysParallelSortPerformance() {
		long[] values = new long[100000000];
		Random randomNum = new Random();

		//Generating random values 
		for (int i=0; i<100000000; i++) {
			values[i] = randomNum.nextLong();
		}
		//Sorting the 'values' array 
		Arrays.parallelSort(values);
	}


}
