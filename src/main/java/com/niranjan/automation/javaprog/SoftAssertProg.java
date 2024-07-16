package com.niranjan.automation.javaprog;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class SoftAssertProg {
public static void main(String[] args) {
	int num1 = 456, num2 =567;
	//SoftAssert softAssert = new SoftAssert(); for softassertion object creation is needed
	System.out.println("1");
	System.out.println("2");
	System.out.println("3");
//	softAssert.assertEquals(num1, num2); // condition failed but still the rest of the statement will execute that is soft assertion
	Assert.assertEquals(num1, num2); // example for hard assertion here if condition is failed next statement will not be executed
	System.out.println("4");
	System.out.println("5");
	System.out.println("6");
		
	
}
}
