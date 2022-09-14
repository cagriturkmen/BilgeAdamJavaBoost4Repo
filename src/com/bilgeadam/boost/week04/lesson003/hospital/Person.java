package com.bilgeadam.boost.week04.lesson003.hospital;

public abstract class Person {
	
	String name;
	boolean isHealthy;
	int age;
	
	
	
	public Person() {
	}

		//All args constructor
		public Person(String name, boolean isHealthy, int age) {
		super();
		this.name = name;
		this.isHealthy = isHealthy;
		this.age = age;
	}
		
		
		
	public Person(String name, boolean isHealthy) {
			super();
			this.name = name;
			this.isHealthy = isHealthy;
		}

	public boolean checkIfHealty() {
		if(this.isHealthy==true) {
			checkUp();
		}else {
			examinePatient();
			givePerscription();
		}
		return isHealthy;
	}
	
	abstract void checkUp();
	abstract void examinePatient();
	void givePerscription() {
		System.out.println("Yapılan muayeneler sonucuna göre reçete yazıldı.");
	}
	
	
		

	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHealthy() {
		return isHealthy;
	}

	public void setHealthy(boolean isHealthy) {
		this.isHealthy = isHealthy;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
