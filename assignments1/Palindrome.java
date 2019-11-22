package com.assignments1;

public class Palindrome {
	/**
	 * This class is used to check the given string is palindrome or not by using
	 * recursion
	 * 
	 *
	 */
		public static boolean isPalindrome(String string) {
			if (string.length() == 0 || string.length() == 1)
				return true;
			if (string.charAt(0) == string.charAt(string.length() - 1))
				/*
				 * calling the method to check the SubString
				 */
				return isPalindrome(string.substring(1, string.length() - 1));
			return false;
		}

	}







