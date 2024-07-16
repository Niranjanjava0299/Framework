package com.niranjan.automation.appln.testdata;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProg1 {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
	Workbook workbook = WorkbookFactory.create(fip);
	Sheet sheet = workbook.getSheet("Gmail_Data");
	for (int i=0;i<=sheet.getLastRowNum();i++)
	{
		Row row = sheet.getRow(i);
        for(int j=0;j<=row.getLastCellNum();j++)
        {
        	Cell cell = row.getCell(j);
        	if(cell.getCellType() == CellType.STRING)
        	{
        		String cellVal = cell.getStringCellValue();
        		System.out.println(cellVal);
        	}
        	else if(cell.getCellType() == CellType.NUMERIC)
        	{
        		String cellVal = cell.getNumericCellValue()+"";
        		System.out.println(cellVal);
        	}
        	else if(cell.getCellType() == CellType.BOOLEAN)
        	{
        		String cellVal = cell.getBooleanCellValue()+"";
        		System.out.println(cellVal);
        	}
        	
	   }
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
