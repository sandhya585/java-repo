package com.assignments1;

public class Search {
		static boolean numberIsInArray(int number) {
			int[] array = { 10, 20, 30, 40, 50 };
			for (int i = 0; i < 5; i++) {
				if (array[i] == number) {
					return true;
				}
			}
			return false;
		}
	}






