package com.bilgeadam.boost.week02.lesson004;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter two numbers: ");
		double first = scanner.nextDouble();
		double second = scanner.nextDouble();
		System.out.println("Enter an operator(+,-,*,/,%) : ");
		char operator = scanner.next().charAt(0);
		
		double result;
		
		switch (operator) {
		case '+':
			result= first+second;
			System.out.println(first+" "+operator+" "+second+" = "+ result );		

			break;
		case '-':
			result = first-second;
			System.out.println(first+" "+operator+" "+second+" = "+ result );		

			break;
		case '*':
			result= first*second;
			System.out.println(first+" "+operator+" "+second+" = "+ result );		

			break;
		case '/':
			result = first/second;
			System.out.println(first+" "+operator+" "+second+" = "+ result );		

			break;
		default:
			System.out.println("Error! operator is not correct");
			break;
		}

	}
	
}
