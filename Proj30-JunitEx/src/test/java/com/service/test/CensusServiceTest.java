package com.service.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.junit.test.CensusService;

public class CensusServiceTest {

//	@RepeatedTest(value = 10, name = "execution of {displayName} - {currentRepetition}/{totalRepetitions}")
//	@DisplayName("Testing data export")
//	public void testexportData() {
//		System.out.println("CensusServiceTest.testexportData()");
//		CensusService service = new CensusService();
//		assertEquals("Data exported", service.exportData());
//	}
	
//	@ParameterizedTest
//	@ValueSource(ints = {10,21,34,78,56,11})
//	public void testisOdd(int n) {
//		System.out.println("CensusServiceTest.testisOdd()");
//		CensusService service =  new CensusService();
//		assertTrue(service.isOdd(n));
//	}
	
	@ParameterizedTest
	//@ValueSource(strings = {"tom", "jerry"})
	//@EmptySource //when we want ot supply empty value
	//@NullSource // when we want to supply null value
	@NullAndEmptySource
	public void testsayHello(String user) {
		System.out.println("CensusServiceTest.testisOdd()");
		CensusService service =  new CensusService();
		assertEquals("Hello "+user, service.sayHello(user));
	}
}
