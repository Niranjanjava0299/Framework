package com.niranjan.automation.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.niranjan.automation.base.BaseTest;
import com.niranjan.automation.listeners.ReRunFailedTCS;
import com.niranjan.automation.utilities.PojoReder;
import com.relevantcodes.extentreports.LogStatus;

public class FcTest extends BaseTest{
	@Test
	public void fcTest() throws IOException {
		
//		FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\config.properties");
//		Properties prConf = new Properties();
//		prConf.load(fip);
//		String url = prConf.getProperty("fc_url");
		
		String url = PojoReder.getConfPr().getValue("fc_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);
		

    // getDriver().get("https://www.flipkart.com");
    // getDriver().findElement(By.id("456")).click();

	}

}
