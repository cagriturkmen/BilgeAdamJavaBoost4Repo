package com.bilgeadam.boost.week02.lesson002;

public class ArithmeticOperators {

	public static void main(String[] args) {

//		int x = 2;
//		float y = 1.51f;
//		double z = 1.51;
		
		double x = 2;
		double y = 7;
		
		double sum;
		double sub, multi, mod;
		double div;
		
		sum = x+y;
		sub = x-y;
		multi = x*y;
		mod = x%y;
		div = x/y;
		
//		System.out.println("SUM: " +sum);
//		System.out.println("SUB: "+sub);
//		System.out.println("MULTI: " +multi);
//		System.out.println("MOD: "+ mod);
//		System.out.println("DIV: " +div);
		
		
//		System.out.println("SUM: " +sum +"\n"+"SUB: "+sub+"\n"+"MULTI: " +multi+"\n"+"MOD: "+ mod);
//		
//		System.out.println(x++);
//		System.out.println(x);
		
//		x = x+5 ;
//		x+=5;
		double c = x-=5;
		x/=5;
		x*=5;
		x%=5;
		
		System.out.println(c);
		
		int o =5;
		System.out.println(o);
		o+=5;
		//System.out.println(o+=5);
		
		
	}

}
