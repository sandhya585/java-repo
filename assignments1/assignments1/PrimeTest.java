package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PrimeTest {
	/**
	 * This test is used to test the given number is prime number or not. Time
	 * Complexity: O(n)
	 *
	 */

	@Test
	public void primeNumberCheck() {
		Assertions.assertEquals(true, Prime.isPrimeNumber(2));
	}

}
