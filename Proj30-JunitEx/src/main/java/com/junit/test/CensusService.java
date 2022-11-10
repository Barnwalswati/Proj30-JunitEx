package com.junit.test;

public class CensusService {

	public String exportData() {
		return "Data exported";
	}
	
	public boolean isOdd(int num) {
		if(num%2==0)
			return false;
		return true;
	}
	
	public String sayHello(String user) {
		return "Hello "+ user;
	}
}
