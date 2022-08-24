package com.bilgeadam.boost.week03.lesson003;

public class AccessTest {

	public static void main(String[] args) {
		
		AccessModifiers testObject = new AccessModifiers();
		
		System.out.println("Erisebildigim degiskenler : "
		+testObject.publicVariable
		+testObject.defaultVariable
		+testObject.protectedVariable);
		
	}
	
}
