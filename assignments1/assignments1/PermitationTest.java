package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PermitationTest {
	/**
	 * This test is used to get the given String permutations. Time Complexity:
	 * O(n!)
	 *
	 */

	@Test
	public void Permitation() {
		Assertions.assertEquals(6, permitation.stringPermitation(" ", "jsp"));
	}

}