package com.assignments1;

public class permitation {
		static int count = 0;

		public static int stringPermitation(String permitation, String input) {
			if (input.length() == 0) {
				System.out.println("Permutation is " + permitation);
				count++;
			} else {
				for (int i = 0; i < input.length(); i++) {
					stringPermitation(permitation + input.charAt(i),
							input.substring(0, i) + input.substring(i + 1, input.length()));
				}
			}
			return count;
		}
	}


