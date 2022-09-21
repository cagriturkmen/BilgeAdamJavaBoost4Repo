package com.bilgeadam.boost.week05.lesson003;

public class ExampleArithmeticException {

	public static void main(String[] args) {
		
		try {
			
			int x = 5/0;
			
			System.out.println(x);
		} catch (ArithmeticException e) {
			
			System.out.println("0 a bölme!!");
		//	e.getLocalizedMessage();
			e.printStackTrace();
		
		}
		
		System.out.println("Kodun devamı ");
		
		
	}

}
