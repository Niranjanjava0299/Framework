package com.niranjan.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public interface RegEXUtility {

	public static boolean isValidPhNum(String phNum) {
		
		boolean status = true;
		Pattern pattern = Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(phNum);
		if(matcher.find()&& matcher.group().equalsIgnoreCase(phNum)) {
			System.out.println("It is a valied phone number");
		}
		else {
			System.out.println("It is NOT a valied phone number");
			status = false;
		}
		return status;
	}
	
	
public static boolean isValidMail(String mail) {
		
		boolean status = true;
		Pattern pattern = Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
		Matcher matcher = pattern.matcher(mail);
		if(matcher.find()&& matcher.group().equalsIgnoreCase(mail)) {
			System.out.println("It is a valied phone number");
		}
		else {
			System.out.println("It is NOT a valied phone number");
			status = false;
		}
		return status;
	}
	
}
