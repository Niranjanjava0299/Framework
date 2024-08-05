package com.niranjan.automation.businessscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.niranjan.automation.base.ActionEngine;
import com.niranjan.automation.customisedexceptions.FrameworkException;
import com.niranjan.automation.gmail.pageobjects.HeadersPage;
import com.niranjan.automation.gmail.pageobjects.OpenCartLaptopsNotebooksPage;
import com.niranjan.automation.utilities.PojoReder;

public class OpenCartTest extends ActionEngine {
    
	@Test
	public void verifyLaptopsNotebooksSize() throws IOException, EncryptedDocumentException, FrameworkException, InterruptedException {
// we are entering the url the url is present in config.properties file  to read the data from the this file we have written a class properties reader 
// and properties reader object is present in pojo reader 
		enterUrl(PojoReder.getConfPr().getValue("opencart_url"));
// title is comming from action engine class	
// we are getting test data from excel files to read the data we implemented a class call excel reader and object is present in pojo reader
		verifyTitleOfThePage(PojoReder.getExcelReader().getCellData("sheetname","Open_Cart", 0, 0));
		OpenCartLaptopsNotebooksPage.mouseHoverOnLaptopsNotebooks();
		OpenCartLaptopsNotebooksPage.clickOnShowAllLaptopsNotebooks();
		OpenCartLaptopsNotebooksPage.validateLaptopsNotebooksSize();
	}
	
	@Test
	public void verifyHeaders() throws EncryptedDocumentException, FrameworkException, IOException {
		enterUrl(PojoReder.getConfPr().getValue("opencart_url"));
		verifyTitleOfThePage(PojoReder.getExcelReader().getCellData("sheetname","Open_Cart", 0, 1));
		HeadersPage.validateHeders();
	}
}
