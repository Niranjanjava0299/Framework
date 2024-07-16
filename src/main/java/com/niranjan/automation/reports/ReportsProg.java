package com.niranjan.automation.reports;

import javax.naming.ldap.ExtendedRequest;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class ReportsProg {
public static void main(String[] args) {
 ExtentReports er = new ExtentReports("C:\\Users\\User\\Desktop\\Nevergiveup\\Frameworks\\Results\\report.html");
 ExtentTest et = er.startTest("flipkart");
 et.log(LogStatus.PASS, "chrome browser is opened");
 et.log(LogStatus.PASS, "url is entered as https://www.gmail.com");
 et.log(LogStatus.PASS, "DTA is done on username with testdata : rameshsoft.8309916995"); // DTA- means Data typing action
 et.log(LogStatus.PASS, "click on next button");
 et.log(LogStatus.PASS, "DTA is done on password with testdata : rameshsoft.8309916995");
 et.log(LogStatus.PASS, "clicked on signin button");
 et.log(LogStatus.PASS, "closede the browser");
 
 er.endTest(et);
 er.flush();
 er.close();
	
	
}
}
