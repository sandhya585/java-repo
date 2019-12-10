package com.tax;

import java.util.Scanner;

public class TaxTest {

	public static void main(String[] args) {

		TaxCalculation t = new TaxCalculation();

		System.out.println("Enter CTC of employee:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		long ctc = sc.nextInt();
		t.esiCalculation(ctc);
		t.pfCalculation(ctc);
		t.ptCalculation(ctc);
		t.incometaxCalculation(ctc);
		t.rebate(ctc);
		t.empNetSalary(ctc);
	}

}
