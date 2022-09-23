package com.bilgeadam.boost.week05.bonus;

public class Janitor extends Person implements Accountable{

	int salary;

	
	public Janitor(String name, String lastname) {
		super(name, lastname);
		// TODO Auto-generated constructor stub
		super.job = Occupation.JANITOR;
	}

	@Override
	public String increaseSalary(double salary) {
			
		salary = salary * 1.40;
		
		return "New salary: " + salary;
		
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	

}
