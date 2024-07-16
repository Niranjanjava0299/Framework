package com.niranjan.automation.utilities;

import com.niranjan.automation.base.BaseTest;

public interface DriversPaths {

	String edgeKey ="webdriver.edge.driver";
	String edgeValue = BaseTest.getCurDir()+"\\Drivers\\msedgedriver.exe";
	String chromeKey ="webdriver.chrome.driver";
	String chromeValue = BaseTest.getCurDir()+"\\Drivers\\chromedriver.exe";
	String gekoKey ="webdriver.geko.driver";
	String gekoValue = BaseTest.getCurDir()+"\\Drivers\\geckodriver.exe";
	
}
