package com.bilgeadam.boost.week03.lesson002;

public class WrapperObjectsToPrimitiveTypes {

	public static void main(String[] args) {

	Integer aObj =	Integer.valueOf(23);
	int a = aObj.intValue()	; //converts into primitive types
	
	System.out.println("The value of a : "+ a);
	}
	
	//Unboxing
	Integer a1obj = Integer.valueOf(23);
	int a1 = a1obj;
	
}
