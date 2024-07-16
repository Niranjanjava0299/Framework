package com.niranjan.automation.supporters;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonReader {
	
	private String filePath;
	private JSONParser jsonParser;
	private JSONObject jsonObject;
	private String value ;
	
	
	public JsonReader(String filePath) throws FileNotFoundException, IOException, ParseException 
	{
		this.filePath = filePath;
		jsonParser = new JSONParser();
		Object obj = jsonParser.parse(new FileReader(filePath));
	    jsonObject = (JSONObject) obj;
		
	}

	// this method we are writing to get the value
	
	public String getJsonValue(String key) {
    
		if (jsonObject!=null) {
			 value = (String) jsonObject.get(key);
		}
		else
		{
			System.out.println("jsonObject is pointing to null");
		}
		return value;
	}
	
	// this method we are writing to give programmer specified value
	
	public String getJsonValue(String key,String defaultValue) {
	    
		if (jsonObject!=null) {
			 value = (String) jsonObject.get(key);
			 if (value == null) {
				value = defaultValue;
			}
		}
		else
		{
			System.out.println("jsonObject is pointing to null");
		}
		return value;
	}
	
	// gaeeting all the keys and value
	
	public Map<String, String > getJsonKeyValue() {
		Map<String,String > map = new HashMap<String , String >();
		if (jsonObject!=null) {
			 Set set = jsonObject.keySet();
			 for(Object obj: set) {
				 String key = (String) obj;
				 value = (String) jsonObject.get(key);
				 map.put(key, value);
			 }
		}
		else
		{
			System.out.println("jsonObject is pointing to null");
		}
	 return map;
	}
	
	
	
	
	
}
