package com.bilgeadam.boost.week02.lesson002;

import java.util.Scanner;

public class ModAndDivision {
		
	public static void main(String[] args) {
	
		double a,b;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter first number: ");
		a = scan.nextInt();
		System.out.println("Please enter second number: ");
		b = scan.nextInt();
		
		double div = a/b;
		double mod = a%b;
				
		System.out.println(div);
		System.out.println(mod);
			
	}
}
