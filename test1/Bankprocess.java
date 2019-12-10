package com.test1;

import java.util.Scanner;

public abstract class Bankprocess implements Balance {
	int withdraw, remainingBalance,  showbalance;
	int a = 5000;
	Scanner S = new Scanner(System.in);

	public void showbalance() {
		
		System.out.println("Total balance is : " + a);
	}

	public void withdraw() {
		System.out.println("Enter amount you want to withdraw:");
		withdraw = S.nextInt();
	}

	public void remainingBalance() {
		a = a - withdraw;
		System.out.println("remainingBalance is: " + a);
		
	}
}
