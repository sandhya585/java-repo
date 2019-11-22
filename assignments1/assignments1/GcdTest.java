package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * This is used to get the GCD of two numbers. Time Complexity: O(min(number1,
 * number2))
 *
 */

public class GcdTest {

	@Test
	public void checkGcd() {
		Assertions.assertEquals(11, Gcd.getGcd(55, 121));
	}

	@Test
	public void checkNotGcd() {
		Assertions.assertNotEquals(6, Gcd.getGcd(20, 25));
	}

}
