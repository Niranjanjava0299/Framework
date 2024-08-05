package com.niranjan.automation.base;

import java.awt.Desktop.Action;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.LogStatus;

// no one is allowed to change the behaviour so that is why we have made it as abstract class
 abstract public class ActionEngine extends BaseTest{
	
	public static void enterUrl(String url) {

		try {
			
			getDriver().get(url);
			getExtentTest().log(LogStatus.PASS, "Url is entered as :"+url);
		}
		catch(Exception exception){
			getExtentTest().log(LogStatus.FAIL, "Url is not entered as :"+url);
		}
		
	}
	
	
	
	public static void enterUrl(URL url) // dout
	{

		try {
			
			getDriver().navigate().to(url);
			getExtentTest().log(LogStatus.PASS, "Url is entered as :"+url);
		}
		catch(Exception exception){
			getExtentTest().log(LogStatus.FAIL, "Url is not entered as :"+url);
		}
		
	}
	
	public static String getTitlePage() // opencart
	{
		String title ="";
		try {
			
			 title = getDriver().getTitle();
			getExtentTest().log(LogStatus.PASS, "Title is :"+title);
		}
		catch(Exception exception){
			getExtentTest().log(LogStatus.FAIL, "Title is not :"+title);
		}
		return title;
	}
	
	public static void verifyTitleOfThePage(String expValue) // opencart
	{
		String title = getTitlePage();
		if (title.equalsIgnoreCase(expValue)) {
			getExtentTest().log(LogStatus.PASS, "Title is matching ="+title+" = "+expValue);
		}
		else {
			getExtentTest().log(LogStatus.FAIL, "Title is  Not matching ="+title+" = "+expValue);
		}
	}
	
	public static void getTextOfWebElement(WebElement webElement) //opencart
	{
        
		try {
			String txt = webElement.getText();
		}
		catch(Exception exception){
			System.out.println("text is not provided ");
		}
		
	}
	
	public static void navigateUrl(String url) // dout
	{

		try {
			
			getDriver().navigate().to(url);
			getExtentTest().log(LogStatus.PASS, "Url is entered as :"+url);
		}
		catch(Exception exception){
			getExtentTest().log(LogStatus.FAIL, "Url is not entered as :"+url);
		}
		
	}
	
	public static void enterUrlJS(String url) {

		try {
			
			getDriver().navigate().to(url);
			JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getDriver();
			javascriptExecutor.executeScript(url);
			getExtentTest().log(LogStatus.PASS, "Url is entered as :"+url);
		}
		catch(Exception exception){
			getExtentTest().log(LogStatus.FAIL, "Url is not entered as :"+url);
		}
		
	}
	
	public static void DAT(WebElement webElement,String testData,String elementName) // DTA - data typing action 
	{
      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			webElement.clear();
			getExtentTest().log(LogStatus.PASS, "Element is cleared: "+elementName);
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on : "+elementName+"with test data is :"+testData);
			
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
		
	}
		
		
}
	
	public static void DATJS(WebElement webElement,String testData,String elementName) // we can perform  data typing action with javascript executor 
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			webElement.clear();
			getExtentTest().log(LogStatus.PASS, "Element is cleared: "+elementName);
			webElement.sendKeys(testData);
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on : "+elementName+"with test data is :"+testData);
			
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
		
	}
		
		
}
	
	public static void DATAction(WebElement webElement,String testData,String elementName) // we can perform  data typing action with action class 
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Actions actions = new Actions(getDriver());
			actions.sendKeys(webElement,testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on : "+elementName+"with test data is :"+testData);
			
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
		
	}
		
		
}
	
	public static void DATAction1(WebElement webElement,String testData,String elementName) // doing action another way 
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Actions actions = new Actions(getDriver());
			actions.click(webElement).sendKeys(testData).build().perform();
			getExtentTest().log(LogStatus.PASS, "Data typing action is done on : "+elementName+"with test data is :"+testData);
			
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
		
	}
		
		
}
	
	public static void ClickElement(WebElement webElement,String elementName)
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			webElement.click();
			getExtentTest().log(LogStatus.PASS, "clickaction is performed on :"+elementName);
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}
		
		
}	
	
	public static void ClickByJs(WebElement webElement,String elementName)
	{ // we should write this inside the code how can we click by using java script executor
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			webElement.click();
			getExtentTest().log(LogStatus.PASS, "clickaction is performed on :"+elementName);
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}
		
		
}
	
	public static void ClickByAction(WebElement webElement,String elementName)
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Actions actions = new Actions(getDriver());
			actions.click(webElement).build().perform();
			
			getExtentTest().log(LogStatus.PASS, "clickaction is performed on :"+elementName);
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}
		
		
}
	
	public static void ClickByAction1(WebElement webElement,String elementName)
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Actions actions = new Actions(getDriver());
			actions.doubleClick(webElement).build().perform();
			
			getExtentTest().log(LogStatus.PASS, "clickaction is performed on :"+elementName);
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}
		
		
}
	
	public static void ClickByAction2(WebElement webElement,String elementName)
	{
	      
		try {
			
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Actions actions = new Actions(getDriver());
			actions.sendKeys(webElement,Keys.ENTER).perform();
			getExtentTest().log(LogStatus.PASS, "clickaction is performed on :"+elementName);
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}
		
		
}
	public static void mouseOverActions(WebElement webElement,String elementName) {

try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Actions actions = new Actions(getDriver());
			actions.moveToElement(webElement).build().perform();
			getExtentTest().log(LogStatus.PASS, "mouseover action is performed on :"+elementName);
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}
		
}
	
	public static void mouseOverActionsByJS(WebElement webElement,String elementName) {

		try {
					Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
					getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
					Actions actions = new Actions(getDriver());
					actions.moveToElement(webElement).build().perform();
					getExtentTest().log(LogStatus.PASS, "mouseover action is performed on :"+elementName);
			
				}
			catch(Exception exception) {
				
				getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
			}
				
		}
	
	public static void handleDropDowns(WebElement webElement,String how, String howvalue ,String elementName) {
		try {
			Assert.assertTrue(webElement.isDisplayed()&&webElement.isEnabled());
			getExtentTest().log(LogStatus.PASS, "Element is displayed: "+elementName);
			Select select = new Select(webElement);
			if (how.equalsIgnoreCase("text")) {
				select.selectByVisibleText(howvalue);
				getExtentTest().log(LogStatus.PASS, "DD value is selected through text :"+howvalue);
			}
			else if (how.equalsIgnoreCase("value")) {
				select.selectByValue(howvalue);
				getExtentTest().log(LogStatus.PASS, "DD value is selected through value :"+howvalue);
			}
			else if (how.equalsIgnoreCase("index")) {
				int indx = Integer.parseInt(howvalue);
				select.selectByIndex(indx);
				getExtentTest().log(LogStatus.PASS, "DD value is selected through index :"+howvalue);
			}
	
		}
	catch(Exception exception) {
		
		getExtentTest().log(LogStatus.FAIL, "Element is  Not displayed: "+elementName);
	}

}
	
	public static void handleWindows() // handling multiple windows
	{

		try {
			
		}
		catch(Exception exception) {
			
		}
	}
	
	// handlewindows using index mechanisum
	// write the resuable function for other methods synchronization,method present in action class, method present in js,drop downs ect
	
	

}
