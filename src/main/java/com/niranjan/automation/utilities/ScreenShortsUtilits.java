package com.niranjan.automation.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.niranjan.automation.base.BaseTest;

public interface ScreenShortsUtilits {

	public static String takesScreenshot() throws IOException {
		 TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
    	 File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
    	 String imagePath = BaseTest.getCurDir()+"\\ScreenShots\\"+BaseTest.getTcName()+".jpeg";
    	 FileUtils.copyFile(file, new File(imagePath));
    	 return imagePath;
	}
	
	public static String takesScreenshot(String tcName) throws IOException {
	      TakesScreenshot takesScreenshot = (TakesScreenshot) BaseTest.getDriver();
   	      File file = takesScreenshot.getScreenshotAs(OutputType.FILE);
   	      String imagePath = BaseTest.getCurDir()+"\\ScreenShots\\"+tcName+".jpeg";
   	      FileUtils.copyFile(file, new File(imagePath));
   	      return imagePath;
	}
	
}
