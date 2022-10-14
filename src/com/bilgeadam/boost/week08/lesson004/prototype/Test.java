package com.bilgeadam.boost.week08.lesson004.prototype;

import java.util.List;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Employees employees = new Employees();
		
		employees.loadData();
		Employees employeeClone = employees.clone();
		List<String> newList = employeeClone.getEmployeeList();
		newList.add("Zafer");
		
		System.out.println(employees.getEmployeeList());
		System.out.println(newList);
	}

}
