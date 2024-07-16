package com.niranjan.automation.customisedexceptions;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FinallyProg {
	public static void main(String[] args) throws IOException {
		FileInputStream fip = null;
		Workbook workbook = null;
		
	try 
	{
		 fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
        workbook = WorkbookFactory .create(fip);
	} 
	catch (Exception exception) 
	{
		System.out.println("catch block has been executed");
		exception.getMessage();
	}
	finally 
	{
		System.out.println("this finally block");
		if (workbook!=null) {
			workbook.close();
		}
		else {
			System.out.println("workbook is pointing to null");
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	}

}
