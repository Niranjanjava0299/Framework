package com.niranjan.automation.javaprog;

public class StringProg {

	public static void main(String[] args) {
		
		String str = "Jobs";
		String str1 = 	str.concat("hardwork");
		
		System.out.println(str);
		System.out.println(str1);
		
		System.out.println(str.hashCode());
		System.out.println(str1.hashCode());
		
		StringBuffer sb1 = new StringBuffer("practice");
		StringBuffer sb2 = sb1.append("jobs");
		
		System.out.println(sb1);
		System.out.println(sb2);
		
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		
		if (sb1==sb2) {
			
			System.out.println("equal");
			
		}
		else {
			System.out.println("Not equal");
		}
		
		
		
	}
	
}
