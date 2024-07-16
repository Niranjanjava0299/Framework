package com.niranjan.automation.gmail.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.niranjan.automation.base.ActionEngine;

public class GmailPwdPage extends ActionEngine {

	
	// here we are finding elements by annotation so we need to initial the driver object from page factory we are taking this part of static block because at the timer of loading the class it should execute
		static {
			PageFactory.initElements(getDriver(), GmailPwdPage.class); // maintain all the elements of gmail password
		}
		
		@FindBy(name="passwd")
		private static WebElement password;
		
		@FindBy(id="passwordNext")
		private static WebElement signIn;
		
		@FindBy(xpath="//span[text()='Forgot password?']")
		private static WebElement frgtpwd;
		
		@FindBy(xpath="//div[text()='Show password']")
		private static WebElement showPwd;
		
	

		
		// identify all the element and write the corresponding method
		
		
		public static void enterPwdTxt(String pwdData) {
			DAT(password,pwdData,"Password");
		
		}
		
		public static  void clickSignInBtn() {
	        ClickElement(signIn, "Sign In");
	        
		}
		
		public static  void clickFrgtPwdBtn() {
	        ClickElement(frgtpwd, "Forgot password");
	        
		}
		
		public static  void clickShowPwdBtn() {
	        ClickElement(showPwd, "Show password");
	        
		}
	
}
