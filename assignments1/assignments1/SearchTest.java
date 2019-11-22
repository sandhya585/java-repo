package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SearchTest {
	/**
	 * This test is used to find the number in array of n numbers. Time Complexity:
	 * O(n)
	 *
	 */

	@Test
	public void findNumber() {
		Assertions.assertEquals(true, Search.numberIsInArray(40));
	}

	@Test
	public void notFindNumber() {
		Assertions.assertEquals(false, Search.numberIsInArray(3));
	}
}
