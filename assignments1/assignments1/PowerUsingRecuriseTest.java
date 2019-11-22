package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PowerUsingRecuriseTest {

	/**
	 * This is used to get the power of given number.
	 * Time complexity: O(n)
	 *
	 */

	public class PowerusingRecursionTest {

		@Test
		public void calculatePower() {
			Assertions.assertEquals(16, PowerUsingRecursion.numberPower(2, 4));
		}

		@Test
		public void calculateWrongPower() {
			Assertions.assertNotEquals(16, PowerUsingRecursion.numberPower(2, 6));
		}

	}
}

	