package com.bilgeadam.boost.week03.lesson002;

public class RecursiveFactorial {

	public static void main(String[] args) {

		int result = factorial(0);
		System.out.println(result);
	}
	
	public static int factorial(int n) {
		
		if( n==0 ) {
			return n*factorial(n-1);

		}else
			return 1;
		
		
		//factorial(4) = 4* 3* 2* 1* 1
		//factorial(3) = 3* factorial(2)
		//factorial(2) = 2* factorial(1)
		//factorial(1) = 1* fact(0)
	}

}
