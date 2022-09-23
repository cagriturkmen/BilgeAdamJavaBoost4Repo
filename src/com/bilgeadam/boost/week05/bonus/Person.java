package com.bilgeadam.boost.week05.bonus;

public abstract class Person  {
	
	private String name;
	private String lastname;
	Occupation job;
	
	public Person(String name, String lastname) {
		super();
		this.name = name;
		this.lastname = lastname;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Occupation getJob() {
		return job;
	}

	public void setJob(Occupation job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", lastname=" + lastname + ", job=" + job + "]";
	}
	
	
	
}
