package com.niranjan.automation.customisedexceptions;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FinallyProg1 {
	// try block example of 1.7 and above version
	public static void main(String[] args) {
		
		try (FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\src\\main\\java\\com\\niranjan\\automation\\appln\\testdata\\TestData.xlsx");
				Workbook workbook = WorkbookFactory .create(fip);)
		{
			
		} 
		catch (Exception exception) 
		{
			System.out.println("catch block has been executed");
			exception.getMessage();
		}
		
	}
	
	
	

}
