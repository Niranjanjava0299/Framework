package com.niranjan.automation.javaprog;

public class StringsProg {
public static void main(String[] args) {
	
	String str = " java selenium ";
	String str1 = str.trim(); // using trim it will remove the spaces at starting and ending point of the vale but not in between
	System.out.println(str1);
	
	char ch = str1.charAt(0); // it give the starting index of the string
	System.out.println(ch);
	
	int index = str1.indexOf("java"); // it gives the index
	System.out.println(index);
	
	String str2 = str1.toLowerCase();
	System.out.println(str2);
	
	String str3 = str1.toUpperCase();
	System.out.println(str3);
	
	String str4 = str1.concat("Job");
	System.out.println(str4);
	
	int comp = str1.compareToIgnoreCase("job");
	System.out.println(comp);
	
	if (str1.contains("java")) {
		System.out.println("it is avaliable");
	}
	
	if (str1.endsWith("selenium")) {
		System.out.println("it is ending with selenium");
	}
	
	String str5 = str1.substring(2);
	System.out.println(str5);
	
	String str6 = str1.substring(2, 5);
	System.out.println(str6);
	
	
	
	
	
	
	
	
}
}
