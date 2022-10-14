package com.bilgeadam.boost.week08.lesson004.prototype2;

public class Test {

	public static void main(String[] args) {
		
		/*
 	private int id ;
	private String name;
	private double salary;
	private String address;
	*/
		
	EmployeeRecord emp = new EmployeeRecord(1, "Cagri", 300, "istanbul");
	
	emp.showRecord();
	EmployeeRecord emp2 = (EmployeeRecord) emp.getClone();

	emp2.showRecord();
	System.out.println(emp);
	System.out.println(emp2);
		
	}

}
