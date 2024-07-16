package com.niranjan.automation.listeners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.niranjan.automation.utilities.ScreenShortsUtilits;

public class TCActivity extends TestListenerAdapter{
	
	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("Tc is failed :" +arg0.getName());
		try {
			ScreenShortsUtilits.takesScreenshot(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("Tc is failed :" +arg0.getName());
		try {
			ScreenShortsUtilits.takesScreenshot(arg0.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Tc is Started: "+ arg0.getName());
	}
	
	@Override
	public void onTestSuccess(ITestResult arg0) {
	     System.out.println("Tc is Success: "+ arg0.getName());
	}

}
