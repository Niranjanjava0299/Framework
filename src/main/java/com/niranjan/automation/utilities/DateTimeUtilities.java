package com.niranjan.automation.utilities;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public interface DateTimeUtilities {

	public static String getCurYMD() {
		LocalDate localDate = LocalDate.now();
		return localDate.toString();
	}
	
	public static String getCurTime() {
		LocalTime localTime = LocalTime.now();
		return localTime.toString();
	}
	
	public static String getCurDateTime() {
		LocalDateTime localDateTime = LocalDateTime.now();
		return localDateTime.toString();
	}
	
	public static String getFeatureDate(int pluseDaysToAdd) {
		LocalDate localDate = LocalDate.now();
		localDate.plusDays(pluseDaysToAdd);
		return localDate.toString();
	}
	
	public static String getPastDate(int minusDaysToAdd) {
		LocalDate localDate = LocalDate.now();
		localDate.minusDays(minusDaysToAdd);
		return localDate.toString();
	}
}
