package com.niranjan.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class DateTimeProg {
public static void main(String[] args) {
	
	
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println("Before formatting :"+localDateTime);
	
	DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	String formattedDateTime = localDateTime.format(dateTimeFormatter);
	System.out.println("after formatting :"+formattedDateTime);

	
	
	
	
	
	
	
	
	
	/*LocalDate localDate = LocalDate.now();
	System.out.println("today date is:"+ localDate);
	
	LocalDate tomDate =  localDate.plusDays(1);
	System.out.println("tom date is:"+ tomDate);
	
	LocalDate dayAfterTomDate =  localDate.plusDays(2);
	System.out.println("Day After Tom date is:"+ dayAfterTomDate);
	
	LocalDate yesterdayDate = localDate.minusDays(1);
	System.out.println("yesterday date is:"+ yesterdayDate);
	
	LocalTime localTime = LocalTime.now();
	System.out.println(localTime);
	
	LocalTime featureLocalTime = localTime.plusMinutes(20);
	System.out.println(featureLocalTime);
	
	LocalDateTime localDateTime = LocalDateTime.now();
	System.out.println(localDateTime);
	
	int year = localDateTime.getYear();
	System.out.println("year: "+ year );
	
	Month month = localDateTime.getMonth();
	System.out.println("Month: "+ month );*/


}
}
