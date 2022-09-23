package com.bilgeadam.boost.week05.bonus;

public class Manager extends Person implements Accountable{

	int salary;

	
	public Manager(String name, String lastname) {
		super(name, lastname);
		super.job = Occupation.MANAGER;
		// TODO Auto-generated constructor stub
	}

	@Override
	public String increaseSalary(double salary) {

		salary = salary * 1.30;
		
		return "New salary: " + salary;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
