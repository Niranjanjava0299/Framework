package com.niranjan.automation.appln.testdata;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelProg {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
	
	
//	Workbook workbook = WorkbookFactory.create(new File("C:\Users\User\Desktop\Nevergiveup\Frameworks\src\main\java\com\niranjan\automation\appln\testdata\TestData.xlsx"));
// you can create in the above way or below way both are correct	
	
	FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
	Workbook workbook = WorkbookFactory.create(fip);
	
	List list = workbook.getAllNames();
	
	int noofSheet = workbook.getNumberOfSheets();
	System.out.println("No of Sheet are:"+ noofSheet);
	
	//Sheet sheet = workbook.getSheetAt(0);       this is through index
	Sheet sheet = workbook.getSheet("Gmail_Data"); // this is through sheet name
	
	int noofRows = sheet.getLastRowNum();
	System.out.println("total num of rows:"+noofRows);
	
	Row row0 = sheet.getRow(0);
	int nofCells0row = row0.getLastCellNum();
	System.out.println("0 row cell count is :"+ nofCells0row);
	
	
//	Cell cell00 = row0.getCell(0);
//	String cell00Val = cell00.getStringCellValue(); this code is only if the cell is having string value
//	System.out.println("0 row 0 cell val is:"+ cell00Val);
	
//   we can have data in cell as string or numeric or boolean value  so we have to write all the cells in the below format only
	Cell cell00 = row0.getCell(0);
	if(cell00.getCellType() == CellType.STRING) {
		String cell00Val = cell00.getStringCellValue();
		System.out.println("0 row 0 cell val is:"+ cell00Val);
	}
	else if (cell00.getCellType() == CellType.NUMERIC){
		double val = cell00.getNumericCellValue();
		System.out.println("0 row 0 cell val is:"+ val);
	}
	else if(cell00.getCellType() == CellType.BOOLEAN) {
		boolean val = cell00.getBooleanCellValue();
		System.out.println("0 row 0 cell val is:"+ val);
		
	}
	
// if we want to write the data to the existing row then we that to create the cell and write the data 
	
	Cell cell04 = row0.createCell(4);
	cell04.setCellValue("Practices");
	
	
	Row row4 = sheet.getRow(4);
    Cell cell43 = row4.createCell(3);
    cell43.setCellValue(4567);
    
// if row is not available then create the row and create the coloum
    
    Row row5 = sheet.createRow(5);
    Cell cell50 = row5.createCell(0);
    cell50.setCellValue("Niranjan");
    
    Cell cell51 = row5.createCell(1);
    cell50.setCellValue(1999);
    
    
// we have writen the data to the file so we need to save the file 
    
    FileOutputStream fop = new FileOutputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
    workbook.write(fop);
    
// after running the application just refresh the project you can see the data in the excel sheet
	

}
}
