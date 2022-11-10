package com.service.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import java.time.Duration;
import org.junit.jupiter.api.*;

import com.junit.test.BankService;

@DisplayName("Testing BankService class ")
//@TestMethodOrder(value = OrderAnnotation.class) //best
//@TestMethodOrder(value = MethodName.class)
//@TestMethodOrder(value = org.junit.jupiter.api.MethodOrderer.DisplayName.class)
@TestMethodOrder(value = MethodOrderer.Random.class) //default

public class TestBankService {

	private static BankService service;
	
//	@BeforeEach
//	public void setUp() {
//		System.out.println("TestBankService.setUp()");
//		service =  new BankService();
//	}
	
	@BeforeAll
	public static void setUpOnce() {
		System.out.println("TestBankService.setUpOnce()");
		service =  new BankService();
	}
	
	@Test
	@DisplayName("Testing with Big Number")
	@Tag("dev")
	public void testcalcSimpleInterestwithBigNUmber() {
		System.out.println("TestBankService.testcalcSimpleInterestwithBigNUmber()");
		float actual = service.calcSimpleInterest(10000000, 2, 12);
		float expected = 2400000.12f;
		assertEquals(expected, actual, "may be result not matching");
	}
	@Test
	@Order(1)
	@DisplayName("Testing with Small Number")
	@Tag("dev")
	public void testcalcSimpleInterestwithSmallNUmber() {
		System.out.println("TestBankService.testcalcSimpleInterestwithSmallNUmber()");
		float actual = service.calcSimpleInterest(100000, 2, 12);
		float expected = 24000.0f;
		assertEquals(expected, actual, "may be result not matching");
	}
	@Test
	@Order(2)
	@DisplayName("Testing with Invalid Input")
	@Tag("dev")
	public void testcalcSimpleInterestwithInvalidInput() {
		System.out.println("TestBankService.testcalcSimpleInterestwithInvalidInput()");
		assertThrows(IllegalArgumentException.class, ()-> service.calcSimpleInterest(0, 2, 12), "may be exception raised");
	}
	@Test
	//@Disabled
	@Order(5)
	@DisplayName("Testing with Timer")
	@Tag("uat")
	public void testcalcSimpleInterestwithTimer() {
		System.out.println("TestBankService.testcalcSimpleInterestwithTimer()");
		BankService service =  new BankService();
		assertTimeout(Duration.ofMillis(10000), ()-> service.calcSimpleInterest(10000000, 2, 12), "may be exception raised");
	}
	@Test
	@DisplayName("Testing for no exception")
	@Order(-10)
	@Tag("uat")
	@Tag("dev")
	public void testcalcSimpleInterestForNoException(TestInfo info) {
		System.out.println("TestBankService.testcalcSimpleInterestForNoException()");
		System.out.println(info.getTags()+" "+info.getDisplayName()+" "+info.getTestClass().get());
		assertDoesNotThrow(()->service.calcSimpleInterest(10000,  2,  12));
	}
	
//	@AfterEach
//	public void clear() {
//		System.out.println("TestBankService.clear()");
//		service = null;
//	}
	
	@AfterAll
	public static void clearOnce() {
		System.out.println("TestBankService.clearOnce()");
		service = null;
	}
}
