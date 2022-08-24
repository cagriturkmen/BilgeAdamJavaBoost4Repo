package com.bilgeadam.boost.week03.lesson003;

public class GettersSettersTest {

	public static void main(String[] args) {
		
		GettersSetters testObject = new GettersSetters();
		testObject.setLastname("Turkmen");
		testObject.setName("Cagri");
		
		System.out.println(testObject.getName());
		System.out.println(testObject.getLastname());
		
		testObject.getTcid();
//		testObject.name="fsd";
	}
	
	

	
}
