package com.niranjan.automation.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import com.niranjan.automation.base.BaseTest;
import com.niranjan.automation.utilities.PojoReder;
import com.relevantcodes.extentreports.LogStatus;

public class InstaTest extends BaseTest{
	
	@Test
	private void instaTest() throws IOException {
		
//		FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\config.properties");
//		Properties prConf = new Properties();
//		prConf.load(fip);
//		String url = prConf.getProperty("inst_url");
		
		String url = PojoReder.getConfPr().getValue("inst_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);
		
		
	   //  getDriver().get("https://www.rameshsoft.com");

	}

}
