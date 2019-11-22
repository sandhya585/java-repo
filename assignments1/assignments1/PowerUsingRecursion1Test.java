package com.assignments1;

import org.junit.jupiter.api.Assertions;

import org.junit.jupiter.api.Test;

class PowerUsingRecursion1Test {
	/**
	 * This is used to get the power of given number.
	 * @author Sandeep Reddy
	 *
	 */
		@Test
		public void calculatePower() {
			Assertions.assertEquals(16, PowerUsingRecursion1.numberPower(2, 4));
		}

		@Test
		public void calculateWrongPower() {
			Assertions.assertNotEquals(16, PowerUsingRecursion1.numberPower(2, 6));
		}

	}