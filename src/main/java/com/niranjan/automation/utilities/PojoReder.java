package com.niranjan.automation.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.json.simple.parser.ParseException;

import com.niranjan.automation.supporters.ExcelReader;
import com.niranjan.automation.supporters.JsonReader;
import com.niranjan.automation.supporters.PropertiesReader;

//here we are going to maintain all the supporters objects 

public class PojoReder {

	// for configuration file
	
	public static PropertiesReader getConfPr() throws IOException{
			PropertiesReader prConf = new PropertiesReader(FilePaths.confpath);
		return prConf;
	}
	
	// for object repository file
	public static PropertiesReader getorPr() throws IOException{
		PropertiesReader prOr = new PropertiesReader(FilePaths.orpath);
	    return prOr;
    }
	
	public static ExcelReader getExcelReader() throws EncryptedDocumentException, IOException {
		ExcelReader excelReader = new ExcelReader(FilePaths.excelpath);
		return excelReader;
	}
	
	public static JsonReader getJsonObj() throws FileNotFoundException, IOException, ParseException
	{
		JsonReader jsonReadr = new JsonReader(FilePaths.jsonpath);
		return jsonReadr;
	}
	
}
