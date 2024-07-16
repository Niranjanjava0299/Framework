package com.niranjan.automation.javaprog;

public class CloneProg implements Cloneable // in order to work with clone that class should must implement cloneable interface

{
	
	int practiceHrs;
	String result;
	
	public void display() {
           System.out.println(practiceHrs + "=" +result);
	}
	public static void main(String[] args) throws CloneNotSupportedException {
		CloneProg prog = new CloneProg(); // this is the original object but i dont want to use this i want to create duplicate object and use
		Object obj = prog.clone();
		CloneProg prog1 = (CloneProg) obj; // we have performed type casting to object
		System.out.println(prog.hashCode());
		System.out.println(obj.hashCode());
		prog1.practiceHrs =9;
		prog1.result = "jobs";
		prog1.display();
		
		
	}

}
