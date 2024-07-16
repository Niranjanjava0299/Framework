package com.niranjan.automation.gmail.pageobjects;

import org.openqa.selenium.support.PageFactory;

import com.niranjan.automation.base.ActionEngine;

public class GmailSuccessPage extends ActionEngine{

	// here we are finding elements by annotation so we need to initial the driver object from page factory we are taking this part of static block because at the timer of loading the class it should execute
			static {
				PageFactory.initElements(getDriver(), GmailSuccessPage.class); // maintain all the elements of gmail password
			}
	
}
