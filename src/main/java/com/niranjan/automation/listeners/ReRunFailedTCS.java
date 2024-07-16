package com.niranjan.automation.listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ReRunFailedTCS implements IRetryAnalyzer{

	int retryCount = 0;
	int maxRetryCount = 4;
	@Override
	public boolean retry(ITestResult result) {
		if(ITestResult.FAILURE == result.getStatus()&&retryCount<=maxRetryCount ) {
			System.out.println("Count is:"+retryCount+"executing tc:"+result.getName());
			retryCount++;
			return true;
		}
		return false;
		
	}

}
