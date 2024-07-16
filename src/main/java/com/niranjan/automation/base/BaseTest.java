package com.niranjan.automation.base;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.niranjan.automation.customisedexceptions.FrameworkException;
import com.niranjan.automation.utilities.DriversPaths;
import com.niranjan.automation.utilities.ScreenShortsUtilits;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import lombok.Getter;
// it is tightly encapsulated class																												
public class BaseTest {
	
	 private static WebDriver driver;  // @Getter
	 private static String curDir;  // @Getter
	 private static String tcName; // @Getter
	 private static ExtentReports extentReports;  // @Getter
	 private static ExtentTest extentTest ; // @Getter
	
	
	@Parameters({"browser"})
	@BeforeSuite
	public void openBrowser(@Optional("chrome")String browser) {
		curDir = System.getProperty("user.dir");
	     if(browser.equalsIgnoreCase("edge")) {
	    	 System.setProperty(DriversPaths.edgeKey,DriversPaths.edgeValue);
	    	 driver = new EdgeDriver();
	    	 init();
	     }
	     else if(browser.equalsIgnoreCase("chrome")) {
	    	 System.setProperty(DriversPaths.chromeKey, DriversPaths.chromeValue);
	    	 driver = new ChromeDriver();
	    	 init();	 
	     }
	     else if(browser.equalsIgnoreCase("firefox")) {
	    	 System.setProperty(DriversPaths.gekoKey, DriversPaths.gekoValue);
	    	 driver = new FirefoxDriver();
	    	 init();	 
	     }
	}
	
	public void init() {
		
		 driver.manage().window().maximize();
	   	 driver.manage().deleteAllCookies();
	   	 driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
	}
	
	
	@AfterSuite
	public void closeBrowser() throws FrameworkException {
		 if (driver!=null) {
	    	  driver.close();
	      }
	      else 
	      {
	    	  FrameworkException exception = new FrameworkException("Driver is pointing to null");
	    	  throw exception;
	    	  //System.out.println("Driver is pointing to null");
	    	  
	      }
	}
	
	@BeforeMethod
	public void beforeTcExecution(Method method) {
           tcName =  method.getName();
           System.out.println("current tcname: "+tcName);
           extentTest =  extentReports.startTest(tcName);
           extentTest.log(LogStatus.PASS, "current tcname: "+tcName);
	}
	
	@AfterMethod
	public void afterTcExection(ITestResult result) throws IOException {
         if (result.getStatus() == ITestResult.SUCCESS) {
        	 System.out.println("Tc is passed :"+result.getName());
        	 extentTest.log(LogStatus.PASS,"Tc is passed :"+result.getName());
         }
         else if (result.getStatus() == ITestResult.FAILURE) {
        	 System.out.println("Tc is failure :"+result.getName());
        	String imagePath = ScreenShortsUtilits.takesScreenshot();
        	 extentTest.log(LogStatus.FAIL, "Tc is failure :"+result.getName());
        	 extentTest.log(LogStatus.FAIL, result.getThrowable()); // this give the reason why it got failed
        	 extentTest.addScreenCapture(imagePath); // we are adding the scrrenshot to the reporets
         }
         else if (result.getStatus() == ITestResult.SKIP) {
        	 System.out.println("Tc is skiped :"+result.getName());
        	 String imagePath =  ScreenShortsUtilits.takesScreenshot();
        	 extentTest.log(LogStatus.SKIP, "Tc is skiped :"+result.getName());
        	 extentTest.log(LogStatus.SKIP, result.getThrowable()); // this give the reason why it got skiped
        	 extentTest.addScreenCapture(imagePath); // we are adding the scrrenshot to the reporets
        	 
        	 extentReports.endTest(extentTest);
        	 extentReports.flush();
        	 
         }
	}
	
	
	/* we have commented this code because we have used getter method from lombok */
	public static WebDriver getDriver() {
		return driver;
	}

	public static String getCurDir() {
		return curDir;
	}
	
	public static String getTcName() {
		return tcName;
	} 	
	@BeforeTest
	public void initReports() {
     extentReports = new ExtentReports(System.getProperty("user.dir")+"\\Results\\report.html");
	}
	
	@AfterTest
	public void closedReports() throws FrameworkException {
		if(extentReports!= null) {
			extentReports.close();
			
		}
		else {
			FrameworkException exception = new FrameworkException("extentReport object is pointing to null");
			throw exception;
		}

	}
	
	public static ExtentTest getExtentTest() {
		return extentTest;
	}
	

}
