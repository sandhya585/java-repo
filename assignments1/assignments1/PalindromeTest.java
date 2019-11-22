package com.assignments1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PalindromeTest {
	/**
	 * This is used to check the given string is palindrome or not.
	 * Time Complexity : O(N ^2)
	 *
	 */

	@Test
	public void palindromeCheck()
	{
	Assertions.assertEquals(true,Palindrome.isPalindrome("sandy".toUpperCase()));
	}

	@Test
	public void isNotPalindromeCheck()
	{
	Assertions.assertEquals(false, Palindrome.isPalindrome("rao".toUpperCase()));
	}
	@Test
	public void isNotPalindromeCheck1()
	{

	String input=null;
	Assertions.assertEquals(false, Palindrome.isPalindrome(input));
	}
	}
