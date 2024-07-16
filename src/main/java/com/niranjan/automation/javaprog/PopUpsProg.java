package com.niranjan.automation.javaprog;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.niranjan.automation.base.BaseTest;

public class PopUpsProg extends BaseTest{
    
	@Test
	public static void main(String[] args) throws InterruptedException {
		
		getDriver().get("give the url of the popup window base  popup");
		getDriver().findElement(By.id("1")).sendKeys("send the location of the txt file from desktop\\program.txt"); // with this line we has successfully uploaded the txt file (this we can perform when element type = file)
		
		
		
		
		
		
		
	/*	
         example of web based popups
         
		getDriver().findElement(By.xpath("//button[@onclick='promptFunction()']")).click();
		Alert alert = getDriver().switchTo().alert(); // we are switiching from web applicatiuon to popup 
		alert.sendKeys("Niranjan"); // sending data to the popup
		String txt = alert.getText();//  to get popup text
		System.out.println("popups text :"+txt);
		alert.accept();// this for clicking on ok */
		Thread.sleep(5000);
	}
}
