package com.niranjan.automation.gmail.pageobjects;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.niranjan.automation.base.ActionEngine;
import com.niranjan.automation.base.CommonMethods;
import com.niranjan.automation.customisedexceptions.FrameworkException;
import com.niranjan.automation.utilities.PojoReder;
import com.relevantcodes.extentreports.LogStatus;

public class HeadersPage extends ActionEngine {

	static 
	{
		PageFactory.initElements(getDriver(),HeadersPage.class);
	}
	
	@FindBys({@FindBy(xpath= "//div[@class='image']")})
	private static List<WebElement> actualHeaders;
	
	
	public static List<String> getActualTextHeaders() {
          List<String> list =  CommonMethods.getTextElements(actualHeaders);
          return list;
	}
	
	public static List<String> getExpectedHeaders() throws EncryptedDocumentException, FrameworkException, IOException {
      String data =  PojoReder.getExcelReader().getCellData("sheetname", "Open_Cart", 0, 1);
      //output: Desktops,Laptops&Notebooks,Components,Tablets,Software,Phones&PDAs,Cameras,MP3 Players
                  String[] str = data.split(",");
                  List<String> expData = new ArrayList<String>();
                  for(String str1: str) {
                	  expData.add(str1);
                  }
                return expData;	  
	}
	
	public static void validateHeders() throws EncryptedDocumentException, FrameworkException, IOException {
		 List<String> actualData = getActualTextHeaders();
		 List<String> expData = getExpectedHeaders();
		 // i want to maintain in sorting nature
		 Collections.sort(actualData);
		 Collections.sort(expData);
		 if (actualData==expData) {
			getExtentTest().log(LogStatus.PASS, "Headers are matching"+actualData+"="+expData);
		}
		 else {
			 getExtentTest().log(LogStatus.FAIL, "Headers are not matching"+actualData+"="+expData);
		 }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
