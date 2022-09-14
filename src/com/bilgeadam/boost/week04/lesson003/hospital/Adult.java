package com.bilgeadam.boost.week04.lesson003.hospital;

public class Adult extends Person{
	
	

	public Adult(String name, boolean isHealthy, int age) {
		super(name, isHealthy, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	void checkUp() {
		
		System.out.println("Sağlık kontrolü yapıldı");
		
	}

	@Override
	void examinePatient() {
		
		System.out.println("Hasta muayenesi yapıldı.");
		
	}

	
	
	
}
