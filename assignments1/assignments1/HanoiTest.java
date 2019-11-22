package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class HanoiTest {
	/**
	 * Time Complexity : 2^n-1
	 * This test is used to check the Tower of Hanoi  disk moves.
	 *
	 */
	@Test
	public void test()
	{
	Assertions.assertEquals(1,Hanoi.towerOfHanoiPuzzle(3, 'A', 'c', 'B'));
	}

	}

