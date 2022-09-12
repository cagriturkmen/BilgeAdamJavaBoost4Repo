package com.bilgeadam.boost.week03.lesson004;

public class BreakContinue {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			
		//	System.out.println(i);
			if(i==5) {
				System.out.println("Burası cok tehlikeli");
				//continue;
				//break;
			}
			System.out.println(i);
			//System.out.println(i);
			
		}
		System.out.println("Outside of loop");
	}

}
