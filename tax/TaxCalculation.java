package com.tax;

public class TaxCalculation implements Taxcal {

	public static float pf;
	public static float pt;
	public static double tax;
	public static float esi;
	public static float rebate;
	public static double netsalary;

	public void pfCalculation(long ctc) {
		pf = (float) (ctc * 0.12);
		System.out.println("Employee PF per year is:" + pf);

	}

	public void ptCalculation(long ctc) {
		if ((ctc / 12) < 15000) {
			pt = 0;
		}
		if ((ctc / 12) > 15000 && (ctc / 12) < 20000) {
			pt = 150;
		}
		if ((ctc / 12) > 20000) {
			pt = 200;

		}
		pt = pt * 12;
		System.out.println("Employee PT per year is:" + pt);

	}

	public void incometaxCalculation(long ctc) {
		if (ctc < 250000) {
			tax = 0;
		} else if (ctc > 250000 && ctc <= 500000) {
			tax = (ctc - 250000) * (5 / 100);
		} else if (ctc > 500000 && ctc <= 1000000) {

			tax = 12500 + ((ctc - 500000) * 20 / 100);

		} else {
			tax = 12500 + 100000 + ((ctc - 1000000) * 30 / 100);
		}
		System.out.println("Income Tax is:" + tax);

	}

	public void rebate(long ctc) {

		if (ctc <= 350000) {
			rebate = 1500;
		}

		if (ctc > 350000 && ctc < 500000) {
			rebate = 5000;

		}
		System.out.println("Rebate amount is" + rebate);

	}

	public void esiCalculation(long ctc) {

		if ((ctc / 12) > 21000) {

			esi = (float) ((ctc / 12) * (1.75 / 100));
			esi = esi * 12;
			System.out.println("Employee ESI per year is: " + esi);

		}

	}

	@Override
	public void empNetSalary(long ctc) {

		netsalary = (ctc - esi - pf - pt - tax + rebate);
		System.out.println("Employee Net Salary Per Annum Is:" + netsalary);
		System.out.println("Employee Net Salary Per month is:" + (netsalary / 12));

	}

}
