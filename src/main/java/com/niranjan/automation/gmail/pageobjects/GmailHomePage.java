package com.niranjan.automation.gmail.pageobjects;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.niranjan.automation.base.ActionEngine;

public class GmailHomePage extends ActionEngine{
	
// here we are finding elements by annotation so we need to initial the driver object from page factory we are taking this part of static block because at the timer of loading the class it should execute
	static {
		PageFactory.initElements(getDriver(), GmailHomePage.class); // maintain all the elements of gmail homepage
	}
	@FindBy(id="identifierId")
	private static WebElement userName;
	
	@FindBy(id="identifierNext")
	private static WebElement nxt;
	
	@FindBy(xpath="//span[text()='Create account']")
	private static WebElement createAcc;
	
	@FindBy(xpath="//span[text()='to continue to Gmail']")
	private static WebElement continueToGmail;
	
	@FindBy(xpath="//span[text()='Sign in']")
	private static WebElement signIn;

	
	// identify all the element and write the corresponding method
	
	
	public static void enterUserNameTxt(String unData) {
		DAT(userName,unData,"UserName");
	
	}
	
	public static  void clickNxtBtn() {
        ClickElement(nxt, "Next");
        
	}
	
	public static  void clickCreateAcc() {
        ClickElement(createAcc, "Create Account");
        
	}
	
	
	
	
	
	
	
	
	
	
	
	


}
