package com.bilgeadam.boost.week05.bonus;

public class Doctor extends Person implements Accountable{
	
	int salary;
	
	public Doctor(String name, String lastname) {
		super(name, lastname);
		super.job = Occupation.DOCTOR;
		
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

	@Override
	public String toString() {
		return "Doctor [salary=" + salary + ", getName()=" + getName() + ", getLastname()=" + getLastname()
				+ ", getJob()=" + getJob() + "]";
	}
	

}
