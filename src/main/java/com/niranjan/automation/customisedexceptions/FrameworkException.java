package com.niranjan.automation.customisedexceptions;

public class FrameworkException extends Exception {
	
	public FrameworkException() {
		super(); // to throw our own exception type
		
	}
	
	public FrameworkException(String exceptionMsg) {
		super(exceptionMsg); 
		
	}

}
