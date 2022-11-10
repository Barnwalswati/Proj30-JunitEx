package com.junit.test;

public class BankService {

	public float calcSimpleInterest(float pAmt, float rate, float time) {
		System.out.println("BankService.calcSimpleInterest()");
		if(pAmt<=0 || rate<=0 || time<=0)
			throw new IllegalArgumentException("invald inputs");
		try {
			Thread.sleep(20000);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return pAmt*rate*time/100.0f;
	}
}
