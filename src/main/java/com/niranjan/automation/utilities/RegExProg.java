package com.niranjan.automation.utilities;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExProg {
public static void main(String[] args) {
	
	String input = "8309916995";
	RegEXUtility.isValidPhNum(input); // RegEXUtility interface we are accessing it with static method
	
	
	/*
	  of this code we have created utility function and we called it here
	String input = "8309916995"; // 10 digit number
	// String input = "08309916995";           // 11 digit number
	// String input = "918309916995";         // 12 digit number
	// String input = "+918309916995";        // 102 digit number
	Pattern pattern = Pattern.compile("(0|[+]?91)?[6-9][0-9]{9}");
	Matcher matcher = pattern.matcher(input);
	if(matcher.find()&& matcher.group().equalsIgnoreCase(input)) {
		System.out.println("It is a valied phone number");
	}
	else {
		System.out.println("It is NOT a valied phone number");
	}  */
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
/*	String str = "java @$programjavajava javaJAVA java456"; // in this string we have find how many time letter a is there
	Pattern pattern = Pattern.compile("a");  // here we are giving letter a patter to find
//	Pattern pattern = Pattern.compile("java"); here we are finding the word java
//	Pattern pattern = Pattern.compile("[avj]"); here [] indicates or-condition it search for either a or v or j
//	Pattern pattern = Pattern.compile("[a-z]"); here [a-z] we will be getting all the small letters from a to z
//	Pattern pattern = Pattern.compile("[a-zA-Z]"); here [a-zA-Z] we will be getting both small and  captial letters from A to Z
//	Pattern pattern = Pattern.compile("[0-9]"); here [0-9] we will be getting only numbers from 0-9
//	Pattern pattern = Pattern.compile("[a-zA-Z0-9]"); here [0-9] we will be getting number, small and  captial letters from A to Z
//	Pattern pattern = Pattern.compile("[^a-zA-Z0-9]"); here [0-9] we will be getting only the special characters 
	Matcher matcher = pattern.matcher(str); // here we are giving the sting to patter to match the specified  letter 
	int count = 0;
	while(matcher.find())  // if the matcher is find it will enter into the while loop
	{
		count++;
		String grp = matcher.group(); // here group means we are getting the matched value in the form of string
		System.out.println(grp);
		int startIndex = matcher.start(); // start will be giving the starting index
		System.out.println(startIndex);
		int endIndex = matcher.end(); // end will be giving the end index
		System.out.println(endIndex);
		System.out.println("********************************");
	}
	
	System.out.println("No of occurance of letter a is:"+count); */
}
}
