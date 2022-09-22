package com.bilgeadam.boost.week05.lesson004.hw;

public class LadiesRoomTest {

	public static void main(String[] args) {
		
		Person p = new Person("Çağrı", "Male");
		Person p2 = new Person("Banu","Female");	
		manCheck(p2);
	}	
	public static void manCheck(Person person) {	
		try {
			if(person.getGender().equalsIgnoreCase("Male")) {
				throw new MyException();
			}else {
				System.out.println("Welcome ladies room.");
			}
		} catch (MyException e) {
		
			System.out.println("Men are not allowed!");
		}					
	}
}
