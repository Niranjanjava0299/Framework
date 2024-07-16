package com.niranjan.automation.javaprog;

import org.openqa.selenium.devtools.v121.page.Page.GetResourceContentResponse;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data // by using this there ius no need tof creating getter and setter method
  public class LombokProg {

  private	int practHrs;
  private String res;
  private double sal;
  private double hike;
 @Getter @Setter private static String name;
	
	// assume we have 200 variable like this
	
/*
	
	public int getPractHrs() {
		return practHrs;
	}
	public void setPractHrs(int practHrs) {
		this.practHrs = practHrs;
	}
	public String getRes() {
		return res;
	}
	public void setRes(String res) {
		this.res = res;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double getHike() {
		return hike;
	}
	public void setHike(double hike) {
		this.hike = hike;
	}             */
	
	public static void main(String[] args) {
		
//		LombokProg prog = new LombokProg();
//		prog.setPractHrs(9);
//		prog.setRes("Jobs");
//		prog.setSal(150000);
//		prog.setHike(120);
//		
//		System.out.println(prog.getPractHrs());
//		System.out.println(prog.getRes());
//		System.out.println(prog.getSal());
//		System.out.println(prog.getHike());   
		
				
				
		
	} 
	

	
} 

