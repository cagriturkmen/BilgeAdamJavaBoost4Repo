package com.bilgeadam.boost.week03.lesson002;

public class PrimitiveTypeToWrapper {

	public static void main(String[] args) {
		
		int a = 5;
		double b = 5.65;
		
		Integer aObj = Integer.valueOf(a); //converts into wrapper class
		Double bObj = Double.valueOf(b);
		
		if(aObj instanceof Integer) {
			
			System.out.println("Integer object is created : " + aObj);
		}else {
			System.out.println("aObj is not Integer");
		}
		
		if(bObj instanceof Double) {
			
			System.out.println("Double object is created : " + bObj);
		}else {
			System.out.println("aObj is not Integer");
		}
		
		//Autoboxing
		int a1 = 5;
		//converts into wrapper class
		Integer a1Obj = a1;
		
		double b1 = 6.5;
		Double b1Obj = b1;
		
	}

}
