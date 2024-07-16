package com.niranjan.automation.businessscripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.niranjan.automation.base.BaseTest;
import com.niranjan.automation.customisedexceptions.FrameworkException;
import com.niranjan.automation.listeners.ReRunFailedTCS;
import com.niranjan.automation.utilities.PojoReder;
import com.relevantcodes.extentreports.LogStatus;

public class GmailTest extends BaseTest{
	@Test
	private void gmailTest() throws IOException, EncryptedDocumentException, FrameworkException {
		
	/*	String cellData = "";
		FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
		Workbook workbook = WorkbookFactory.create(fip);
		Sheet sheet = workbook.getSheet("Gmail_Data");
		Row row0 = sheet.getRow(0);
		Cell cell00 = row0.getCell(0);
		if (cell00.getCellType() == CellType.STRING) { // we have replaced this entire code with line number 46
			cellData = cell00.getStringCellValue();
		}
		else if (cell00.getCellType() == CellType.NUMERIC) {
			cellData = cell00.getNumericCellValue()+"";
		}
		else if (cell00.getCellType() == CellType.BOOLEAN) {
			cellData = cell00.getBooleanCellValue()+"";
		} */
		
//		FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\config.properties");
//		Properties prConf = new Properties();
//		prConf.load(fip);    // this is removed because we have created reusable function 
//		String url = prConf.getProperty("qa_url");
		
		String cellData = PojoReder.getExcelReader().getCellData("index", "0", 0, 0);
		String url = PojoReder.getConfPr().getValue("qa_url");
		getDriver().get(url);
		getExtentTest().log(LogStatus.PASS, "url is entered as: "+url);
		
//		FileInputStream fipor = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\objectrepository\\or_gmail.properties");
//		Properties prOr = new Properties();
//		prOr.load(fipor); // this is removed because we have created reusable function 
//		String unId = prOr.getProperty("qa_un_id");
//		String unNxt = prOr.getProperty("nxt_id");
		
		String unId =	PojoReder.getorPr().getValue("qa_un_id");
		String unNxt = PojoReder.getorPr().getValue("nxt_id");
		
		
     WebElement un = getDriver().findElement(By.id(unId));
     un.clear();
     getExtentTest().log(LogStatus.PASS, "element is clear : "+un);
     un.sendKeys(cellData); //  un.sendKeys("rameshsoft.8309916995"); we have replaced this value will celldata and this celldata value is comming from excelsheet
     getExtentTest().log(LogStatus.PASS, "DTA is done on username with test data  : "+cellData);
     WebElement nxt = getDriver().findElement(By.id(unNxt));
     nxt.click();
     getExtentTest().log(LogStatus.PASS, "clicked on next button");
	}

}
