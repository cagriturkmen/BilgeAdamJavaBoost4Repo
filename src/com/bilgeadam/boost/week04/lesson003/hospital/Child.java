package com.bilgeadam.boost.week04.lesson003.hospital;

public class Child extends Person{

	public Child(String name, boolean isHealthy, int age) {
		super(name, isHealthy, age);
	}
	
	
	public Child() {
		super();
	}


	void getVaccine() {
		System.out.println("Kizamik asisi yapildi");
	}
	
	@Override
	void checkUp() {
		
		System.out.println("Cocuga bir seker verildi");
		System.out.println("Konrolleri yapıldı.");
		
	}

	@Override
	void examinePatient() {
		System.out.println("Oyun esliginde muayene yapıldı");		
	}


	@Override
	public String toString() {
		return "Child [name=" + name + ", isHealthy=" + isHealthy + ", age=" + age + "]";
	}
	

}
