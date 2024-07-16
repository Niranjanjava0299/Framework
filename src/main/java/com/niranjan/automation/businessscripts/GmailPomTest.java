package com.niranjan.automation.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.niranjan.automation.base.ActionEngine;
import com.niranjan.automation.customisedexceptions.FrameworkException;
import com.niranjan.automation.gmail.pageobjects.GmailHomePage;
import com.niranjan.automation.gmail.pageobjects.GmailPwdPage;
import com.niranjan.automation.utilities.PojoReder;

public class GmailPomTest extends ActionEngine{
	@Test
	public void gmaiPomTest() throws IOException, EncryptedDocumentException, FrameworkException {
// here i wanted to enter the url so from action engine class we have written the methodenterUrl - this url is present in config.properties file how to get this object
// 	we have implemented our own class called properties reader class	
		
		// we have entered the url
		enterUrl((PojoReder.getConfPr().getValue("qa_url")));
		
		// next we wnat to enter the username 
		GmailHomePage.enterUserNameTxt(PojoReder.getExcelReader().getCellData("sheetname","Gmail_Data", 0, 0));
		
		// cilcking on nextbutton
		
		GmailHomePage.clickNxtBtn();
		
		//we wanted to enter the password
		
		GmailPwdPage.enterPwdTxt(PojoReder.getExcelReader().getCellData("sheetname","Gmail_Data", 0, 1));
		
		GmailPwdPage.clickSignInBtn();
		
		
		
	}

}
