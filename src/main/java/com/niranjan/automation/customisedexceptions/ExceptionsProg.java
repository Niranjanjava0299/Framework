package com.niranjan.automation.customisedexceptions;

import java.io.FileInputStream;

public class ExceptionsProg {
public static void main(String[] args) {
	System.out.println("1");
	System.out.println("2");
	try {
		
	FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup456\\Frameworks\\config.properties"); // there is no probleam with this code
	//FileInputStream fip = new FileInputStream("C:\\Users\\User\\Desktop\\Nevergiveup456\\Frameworks\\config.properties"); // we are wanted giving the wrong path 	
	
	}
	catch(Exception exception){
		System.out.println("this is catch block");
		/* following are the 3 methods to print exception message
		// exception.printStackTrace();
		//String errorMsg = exception.toString();
		//System.out.println(errorMsg);
		//System.out.println(exception.getMessage());
		 * 
		 */
	}
	System.out.println("3");
	System.out.println("4");
	
}
}
