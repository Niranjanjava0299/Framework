package com.niranjan.automation.businessscripts;

import java.io.FileReader;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.niranjan.automation.base.BaseTest;
import com.niranjan.automation.customisedexceptions.FrameworkException;
import com.niranjan.automation.utilities.PojoReder;

public class JsonGmailTest extends BaseTest {

	@Test
	private void JsonGmailTest() throws IOException, ParseException, EncryptedDocumentException, FrameworkException {
		
	
		String cellData = PojoReder.getExcelReader().getCellData("index", "0", 0, 0);
		String url = PojoReder.getConfPr().getValue("qa_url");
		getDriver().get(url);
		
//		JSONParser jsonParser = new JSONParser();
//		//Object obj = jsonParser.parse("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\gmail.json");  or
//		FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\gmail.json");
//		Object obj = jsonParser.parse(fr);
//		JSONObject jsonObject = (JSONObject) obj; // we are converting obj into json object and we have type casted the object
//		
//		String unId = (String) jsonObject.get("un_id");
//		String unNxt = (String) jsonObject.get("nxt_id");
		String unId = PojoReder.getJsonObj().getJsonValue("un_id");
		String unNxt = PojoReder.getJsonObj().getJsonValue("nxt_id");

		
		
     WebElement un = getDriver().findElement(By.id(unId));
     un.sendKeys(cellData); //  un.sendKeys("rameshsoft.8309916995"); we have replaced this value will celldata and this celldata value is comming from excelsheet
     WebElement nxt = getDriver().findElement(By.id(unNxt));
     nxt.click();
	}

}
