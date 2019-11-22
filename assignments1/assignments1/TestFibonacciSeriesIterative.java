package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.Test;

/**
 * This is used to get the Fibonacci series by using iterative method. Time
 * Complexity : O(n) Space Complexity : O(1)
 * 
 *
 */

public class TestFibonacciSeriesIterative {

	@Test
	public void fibonacciSeries() {
		Assertions.assertEquals(20, FibonociSeriesIterative.testFibonacciSeriesIterative(23));
	}

	@Test
	public void notFibonacciSeries() {
		Assertions.assertNotEquals(6, FibonociSeriesIterative.testFibonacciSeriesIterative(5));
	}
}