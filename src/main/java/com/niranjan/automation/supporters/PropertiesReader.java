package com.niranjan.automation.supporters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class PropertiesReader {

private String filePath;
private String value;
private FileInputStream fileInputStream;
private Properties properties;

public PropertiesReader(String filePath) throws IOException {
	this.filePath = filePath;
    fileInputStream = new FileInputStream(filePath);
	properties = new Properties();
	properties.load(fileInputStream);
}




// this method is for when key has value is available

public String getValue(String Key) {
	if (properties!=null) {
		value = properties.getProperty(Key);
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	return value;
}

// this method is for when key don't have values we want to give default value not jvm specified value

public String getValue(String Key,String defaultValue) {
	if (properties!=null) {
		value = properties.getProperty(Key);
		if (value == null) {
			value = defaultValue;
		}
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	return value;
}

//


public String getValue(Object Key) {
	if (properties!=null) {
		value = (String) properties.get(Key);
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	return value;
}

//

public String getValue(Object Key,Object defaultValue) {
	if (properties!=null) {
		value = (String) properties.getOrDefault(Key, defaultValue);
		if (value == null) {
			value = (String) defaultValue;
		}
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	return value;
}

// we have written this method to write the data into the file

public void writeKeyValue(String key,String value) throws IOException {

	if (properties!=null) {
		properties.setProperty(key, value);
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		properties.store(fileOutputStream, "File saved successfully");
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	
}



// we have written the object for  writeKeyValue

public void writeKeyValue(Object key,Object value) throws IOException {

	if (properties!=null) {
		properties.put(key, value);
		FileOutputStream fileOutputStream = new FileOutputStream(filePath);
		properties.store(fileOutputStream, "File saved successfully");
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	
}

// we have written this for get all the keys 

public Set getAllKeys() {
     
	Set setKeys = null;
	
	if (properties!=null) {
      setKeys = properties.keySet();
	}
	else {
		System.out.println("Properties object is pointing to null");
	}
	return setKeys;
}


//we have written this for get all the values


public List getAllValues() {
  List list = new ArrayList<>();
	if (properties!=null) {
	    Set  setKeys = properties.keySet();
	    for(Object obj: setKeys) {
	    	String key = (String) obj;
	    	list.add(key); 	
	      }
		}
		else {
			System.out.println("Properties object is pointing to null");
		}
	return list;
}


//we have written this for get all the keys&values (better way to hold all keys and values is map)

public  Map<String,String> getKeysValues() {

	Map<String,String> map = new HashMap<String, String>();
	if (properties!=null) {
	      Set setKeys = properties.keySet();
	      for (Object obj : setKeys) {
			String key = (String) obj;
			value = properties.getProperty(key);
			map.put(key, value);
			
		}
	}
		else {
			System.out.println("Properties object is pointing to null");
		}
	return map;
}












}





















