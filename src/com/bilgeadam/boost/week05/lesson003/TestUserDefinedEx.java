package com.bilgeadam.boost.week05.lesson003;

public class TestUserDefinedEx {

	public static void main(String[] args) throws UserDefinedException {

		
		try {
			
			throw new UserDefinedException("This is a programmer defined Exception");
			
		} finally {
			
			System.out.println("Finally ");
		}
		
	}

}
