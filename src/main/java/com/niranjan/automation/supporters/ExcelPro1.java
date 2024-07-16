package com.niranjan.automation.supporters;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelPro1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	File file = new File("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
	FileInputStream fip = new FileInputStream(file);
	Workbook workbook = WorkbookFactory.create(fip);
	int tonoofsheets = workbook.getNumberOfFonts();
	System.out.println(tonoofsheets);
	
}
}
