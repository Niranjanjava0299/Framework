package com.niranjan.automation.gmail.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.niranjan.automation.base.ActionEngine;
import com.relevantcodes.extentreports.LogStatus;

public class OpenCartLaptopsNotebooksPage extends ActionEngine{
	
	static
	{
		PageFactory.initElements(getDriver(), OpenCartLaptopsNotebooksPage.class);
	}
	
	@FindBy(xpath = "//a[text()='Laptops & Notebooks' ]")
	private static WebElement LaptopsNotebooks;
	
	@FindBy(xpath = "//a[text()='Show All Laptops & Notebooks' ]")
	private static WebElement ShowAllLaptopsNotebooks; 
	
	@FindBy(xpath = "//aside[@id='column-left']/div/a[2]")
	private static WebElement LaptopsNotebooksSize; 
	
	@FindBys({@FindBy(xpath= "//div[@class='image']")})
	private static List<WebElement> expLaptopsNotebooksSize;
	
	public static void mouseHoverOnLaptopsNotebooks() {
		mouseOverActions(LaptopsNotebooks," Laptops Notebooks" );
	}
	
	public static  void clickOnShowAllLaptopsNotebooks() throws InterruptedException {
     ClickElement(ShowAllLaptopsNotebooks, "Show All Laptops & Notebooks");
     Thread.sleep(9000);
	}
	
	public static int getActualSizeOfLaptopsNotebooks() {
		String txt = LaptopsNotebooksSize.getText(); //output: Laptops & Notebooks (5)
		String[] txt1 = txt.split("");//output: Laptops & Notebooks (5)
									//          0      1   2        3
		String txt2 = txt1[3];//(5)
		String[] txt3 = txt2.split("");//(5)
		                               //012
		String txt4 = txt3[1];//"5"
		int actualSize = Integer.parseInt(txt4);
		return actualSize;//5
		
	}
	
	public static int getExpectedSizeOfLaptopsNotebooks() {
		int expLaptopsNoteBooksSize = expLaptopsNotebooksSize.size();
		return expLaptopsNoteBooksSize;
	}
	
	public static void validateLaptopsNotebooksSize() {
		int actualSize = getActualSizeOfLaptopsNotebooks();
		int expLaptopsNoteBooksSize = getExpectedSizeOfLaptopsNotebooks();
		if (actualSize==expLaptopsNoteBooksSize) {
			getExtentTest().log(LogStatus.PASS, "Laptops and notebooks size is matching:"+actualSize+"="+expLaptopsNoteBooksSize);
		}
		else {
			getExtentTest().log(LogStatus.FAIL, "Laptops and notebooks size is not matching:"+actualSize+"="+expLaptopsNoteBooksSize);
		}
	}
	

}
