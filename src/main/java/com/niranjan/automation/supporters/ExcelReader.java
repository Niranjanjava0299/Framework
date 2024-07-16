package com.niranjan.automation.supporters;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.niranjan.automation.customisedexceptions.FrameworkException;

public class ExcelReader {
	
	private String filePath;
	private FileInputStream fileInputStream;
	private Workbook workbook;
	private Sheet sheet;
	private Row row;
	private Cell cell;
	private String cellValue; 
	
	// we have initialised the excel path and created the workbook  
	
	public ExcelReader(String filePath) throws EncryptedDocumentException, IOException {
		
		this.filePath = filePath;
		fileInputStream = new FileInputStream(filePath);
	    workbook = WorkbookFactory.create(fileInputStream);
			
	}

// we can call the sheet in 2 ways with sheet name or index
	
	public  Sheet getSheetObj(String how,String howValue) throws FrameworkException {
		if (workbook!=null) {
			if (how.equalsIgnoreCase("sheetname")) {
				sheet =workbook.getSheet(howValue);
			}
			else if(how.equalsIgnoreCase("index")) {
				// here we are getting the value of intex in the form of sting so we are changing into integer
				int indx = Integer.parseInt(howValue);
				sheet = workbook.getSheetAt(indx);
			}
		}
		else {
			FrameworkException exception  = new FrameworkException(" workbook is pointing to null");
			throw exception;
			//System.out.println(" workbook is pointing to null");
		}
		return sheet;
	}
	
	
// we are calling the row data
	
	public Row getRowObj(String how,String howValue,int rowNum) throws FrameworkException {

		if (workbook!=null) {
			
			sheet = getSheetObj(how, howValue);
			if (sheet != null) {
				 row = sheet.getRow(rowNum);
			}
			else {
				System.out.println(" sheet is pointing to null");
			}
		}
		else {
			System.out.println(" workbook is pointing to null");
		}
		return row;
		
	}
	

// we are calling cell data
	
	public String getCellData(String how,String howValue,int rowNum,int cellNum) throws FrameworkException {

         if (workbook!=null) {
			sheet = getSheetObj(how, howValue);
			if (sheet != null) {
				 row = sheet.getRow(rowNum);
				 if(row!= null) {
						cell = row.getCell(cellNum);
						if (cell != null) {
							if (cell.getCellType()== CellType.STRING) {
								cellValue = cell.getStringCellValue();
							}
							else if (cell.getCellType()== CellType.NUMERIC) {
								cellValue = cell.getNumericCellValue()+"";
							}
							else if (cell.getCellType()== CellType.BOOLEAN) {
								cellValue = cell.getBooleanCellValue()+"";
							}
						}
						else {
							System.out.println(" cell is pointing to null");
						}
					}
				 else {
						System.out.println(" row is pointing to null");
					}
			}
			else {
				System.out.println(" sheet is pointing to null");
			}
		}
		else {
			System.out.println(" workbook is pointing to null");
		}
		return cellValue;
		
	}
	
	// we calling total row data 
	
	public List<String> getRowData(String how,String howValue,int rowNum) throws FrameworkException {
		List<String> rowData = new ArrayList<String>();
		
             if (workbook!=null) {
			
			sheet = getSheetObj(how, howValue);
			if (sheet != null) {
				 row = sheet.getRow(rowNum);
				 if (row != null) {
					for(int i=0;i<=row.getLastCellNum();i++) {
						cell = row.getCell(i);
						if (cell != null) {
							if (cell.getCellType()== CellType.STRING) {
								cellValue = cell.getStringCellValue();
								rowData.add(cellValue);
							}
							else if (cell.getCellType()== CellType.NUMERIC) {
								cellValue = cell.getNumericCellValue()+"";
								rowData.add(cellValue);
							}
							else if (cell.getCellType()== CellType.BOOLEAN) {
								cellValue = cell.getBooleanCellValue()+"";
								rowData.add(cellValue);
							}
						}
						else {
							System.out.println(" cell is pointing to null");
						}
					}
				}
				 else {
						System.out.println(" row is pointing to null");
					}
			}
			else {
				System.out.println(" sheet is pointing to null");
			}
		}
		else {
			System.out.println(" workbook is pointing to null");
		}
			return rowData;
	}

	
	
// we are calling  total sheet data	
	
	public List<String> getSheetData(String how,String howValue) throws FrameworkException {
		List<String> sheetData = new ArrayList<String>();
		sheet = getSheetObj(how, howValue);
		
		if (sheet != null) {
			
			for(int i=0;i<=sheet.getLastRowNum();i++) {
				row = sheet.getRow(i);
				if (row != null) {
					
					for(int j=0;j<=row.getLastCellNum();j++) {
						cell = row.getCell(j);// i or j doubt
						if (cell != null) {
							if (cell.getCellType()== CellType.STRING) {
								cellValue = cell.getStringCellValue();
								sheetData.add(cellValue);
							}
							else if (cell.getCellType()== CellType.NUMERIC) {
								cellValue = cell.getNumericCellValue()+"";
								sheetData.add(cellValue);
							}
							else if (cell.getCellType()== CellType.BOOLEAN) {
								cellValue = cell.getBooleanCellValue()+"";
								sheetData.add(cellValue);
							}
						}
						else {
							System.out.println(" cell is pointing to null");
						}
					}
				}
				 else {
						System.out.println(" row is pointing to null");
					}
		
			}
		}
		return sheetData;

	}
	
	
// we calling unique sheet data
	
	public Set<String> getUniqueSheetData(String how,String howValue) throws FrameworkException {
		List<String> list = getSheetData(how, howValue);
		Set<String> set = new HashSet<String>(list);
		return set;
	}
	
	
	
	
	
	
}
	
	
	
	
	
	
