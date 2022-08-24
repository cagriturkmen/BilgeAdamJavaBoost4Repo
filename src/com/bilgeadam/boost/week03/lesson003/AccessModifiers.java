package com.bilgeadam.boost.week03.lesson003;

public class AccessModifiers {

	public String publicVariable = "public değişken";
	
	protected String protectedVariable = "protected degisken";
	
	String defaultVariable = "default degisken";
	
	private String privateVariable = "private degisken";
	
	
	public static void main(String[] args) {
		
		AccessModifiers testObject = new AccessModifiers();
		
		System.out.println("Erisebildigim degiskenler : "
		+testObject.publicVariable+", "
		+testObject.protectedVariable+", "
		+testObject.defaultVariable+", "
		+testObject.privateVariable);
		
	}
	
}
