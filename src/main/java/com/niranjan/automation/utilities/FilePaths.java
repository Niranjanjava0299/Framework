package com.niranjan.automation.utilities;

public interface FilePaths {
	
	
	//  here we are going to maintain all the files path
	String confpath =System.getProperty("user.dir")+"\\config.properties";
	String orpath = System.getProperty("user.dir")+"\\src\\main\\java\\com\\niranjan\\automation\\appln\\objectrepository\\or_gmail.properties";
	String txtpath ="";
	String excelpath =System.getProperty("user.dir")+"\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx";
	String jsonpath =System.getProperty("user.dir")+"\\gmail.json";

}
