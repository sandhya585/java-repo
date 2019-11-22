package com.assignments1;

/**
 * This class is used to find the Gcd of two numbers
 *
 */
public class Gcd {
	public static int getGcd(int number1, int number2) {
		int Gcd = 1;
		for (int i = 1; i <= number1 && i <= number2; i++) {
			if (number1 % i == 0 && number2 % i == 0) {
				Gcd = i;
			}
		}
		return Gcd;

	}
}



