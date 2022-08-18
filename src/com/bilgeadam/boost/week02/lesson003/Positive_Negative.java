package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

public class Positive_Negative {

	public static void main(String[] args) {
		int a;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		a = scanner.nextInt();
		
		if(a<0) {
			System.out.println("Negative");
		}else if(a==0) {
			System.out.println("Zero-Neutral");	
		}else {
			System.out.println("Positive");
		}
		
	}
	
}
