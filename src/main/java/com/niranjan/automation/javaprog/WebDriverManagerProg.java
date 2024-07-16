package com.niranjan.automation.javaprog;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerProg {
public static void main(String[] args) throws InterruptedException {
	// WebDriverManager.chromedriver().browserVersion("95").setup(); by using this we run our chrome driver with our specified version
	// WebDriver driver = WebDriverManager.chromedriver().create(); another way of launching the browser
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	
	driver.get("https://www.gmail.com");
	driver.findElement(By.id("identifierId")).sendKeys("rameshsoft.8309916995");
	String tittle = driver.getTitle();
	System.out.println("1 tab:"+tittle);
	driver.switchTo().newWindow(WindowType.TAB); // here we are switiching to new tab
	driver.get("https://www.facebook.com");
	String tittle1 = driver.getTitle();
	System.out.println("2 tab:"+tittle1);
	
	
	Thread.sleep(5000);
	driver.close();
	
	
}
	
}
