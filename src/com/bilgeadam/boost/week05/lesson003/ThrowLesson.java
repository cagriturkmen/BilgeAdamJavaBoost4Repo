package com.bilgeadam.boost.week05.lesson003;

public class ThrowLesson {

	
	public static void validate(int age) throws UserDefinedException {
		
		if(age<18) {
			throw new UserDefinedException("Person is not eligible to vote");
		}else {
			System.out.println("Person is eligiblee to vote.");
		}
		
	}
	public static void main(String[] args) {
		
		try {
			validate(13);
		} catch (UserDefinedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
