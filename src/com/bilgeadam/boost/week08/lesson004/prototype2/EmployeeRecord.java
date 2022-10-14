package com.bilgeadam.boost.week08.lesson004.prototype2;

public class EmployeeRecord implements Prototype {

	private int id ;
	private String name;
	private double salary;
	private String address;
	
	public EmployeeRecord() {
	}



	public EmployeeRecord(int id, String name, double salary, String address) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public void showRecord() {
		System.out.println("EmployeeRecord [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + "]");
	}

	@Override
	public Prototype getClone() {
		return new EmployeeRecord(id,name,salary,address);
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(String address) {
		this.address = address;
	}	
	
}
