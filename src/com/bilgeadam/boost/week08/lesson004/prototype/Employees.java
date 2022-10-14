package com.bilgeadam.boost.week08.lesson004.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
	
	private List<String> employeeList;
	
	
	

	public Employees() {
		employeeList = new ArrayList<String>();
	}

	public Employees(List<String> employeeList) {
		this.employeeList = employeeList;
	}
	
	public void loadData() {
		employeeList.add("Cagri");
		employeeList.add("Babur");
		employeeList.add("Muhammed");
		employeeList.add("Mustafa");
	}

	public List<String> getEmployeeList() {
		return employeeList;
	}

	@Override
	protected Employees clone() throws CloneNotSupportedException {

		List<String> temp = new ArrayList<>();
		for (String string : this.employeeList) {
			temp.add(string);
		}
		return new Employees(temp);
	}
	
	
	
}
