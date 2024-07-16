package com.niranjan.automation.base;

import java.sql.Time;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import dev.failsafe.Timeout;

public class JavaScriptExecutorProg {
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\Drivers\\chromedriver.exe");
/*	
   this is using directly with the Remote webdriver as reference
  RemoteWebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	
	
	 WebElement un = driver.findElement(By.id("identifierId"));
	 driver.executeScript("argument[0].value='niranjan.8309916995';", un); // here the object is of type var-argparameter that means we can have n-number of object(0-n) that is why the starting argument index is 0
	 
	 WebElement nxt = driver.findElement(By.id("identifierNext"));
	 driver.executeScript("argument[0].click();", nxt);*/
	
	// using  webdriver as reference 
	
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(2,TimeUnit.SECONDS);
	driver.get("https://www.gmail.com");
	
	
	 WebElement un = driver.findElement(By.id("identifierId")); // When we are using webdriver as reference we need to perform type casting 
	 JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
	 javascriptExecutor.executeScript("argument[0].value='niranjan.8309916995';", un); 
	 
	 WebElement nxt = driver.findElement(By.id("identifierNext"));
	 javascriptExecutor.executeScript("argument[0].click();", nxt);
	 
	 javascriptExecutor.executeScript("window.location='https:\\www.gmail.com'"); // we are call the url using javascriptExecutor
	 
	 String domainName = javascriptExecutor.executeScript("return document.domain;").toString();// we are calling the domain name here and converting into string 
	 System.out.println(domainName);
	 
	 String url = javascriptExecutor.executeScript("return document.URL;").toString();// we are calling the url here and converting into string 
	 System.out.println(url);
	 
	 String title = javascriptExecutor.executeScript("return document.title;").toString();// we are calling the title here and converting into string 
	 System.out.println(url);
	 

	 
	 
	
	
}
}
