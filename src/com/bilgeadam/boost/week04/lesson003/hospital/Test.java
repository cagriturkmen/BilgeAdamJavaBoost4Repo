package com.bilgeadam.boost.week04.lesson003.hospital;


public class Test {

	public static void main(String[] args) {
		
		Person person = new Child("safdsaf",true,40);
		Adult adult = new Adult("Huseyin",false,55);
		Child child = new Child();
				
		child.setHealthy(false);
		child.setName("dsfsa");
		
//		adult.checkIfHealty();
//		child.checkIfHealty();
//		child.getVaccine();
//		person.checkIfHealty();
		
		System.out.println(child);
	}

}
