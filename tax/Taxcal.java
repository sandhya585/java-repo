package com.tax;

public interface Taxcal {

	void empNetSalary(long ctc);

	void esiCalculation(long ctc);

	void pfCalculation(long ctc);

	void ptCalculation(long ctc);

	void incometaxCalculation(long ctc);

	void rebate(long ctc);

}
