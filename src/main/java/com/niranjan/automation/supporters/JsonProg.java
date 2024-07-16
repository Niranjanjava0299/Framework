package com.niranjan.automation.supporters;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonProg {
	public static void main(String[] args) throws ParseException, IOException {
		
		JSONParser jsonParser = new JSONParser();
		//Object obj = jsonParser.parse("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\gmail.json");  or
		
		FileReader fr = new FileReader("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\gmail.json");
		Object obj = jsonParser.parse(fr);
		
		JSONObject jsonObject = (JSONObject) obj; // we are converting obj into json object and we have type casted the object
		
		String val1 = (String) jsonObject.get("un_id"); // we have type casted the json object to string
		System.out.println(val1);
		
		String val2 = (String) jsonObject.get("nxt_id"); // we have type casted the json object to string
		System.out.println(val2);
		
		String val3 = (String) jsonObject.get("pwd_name"); // we have type casted the json object to string
		System.out.println(val3);
		
		String val4 = (String) jsonObject.get("signin_id"); // we have type casted the json object to string
		System.out.println(val4);
		
		String val5 = (String) jsonObject.get("signin_id456"); // we have type casted the json object to string we will gaet jvm default value
		System.out.println(val5);
		
		String val6 = (String) jsonObject.getOrDefault("signin_id456", "Job"); // we have type casted the json object to string
		System.out.println(val6);
		
		
		
		
	}

}
