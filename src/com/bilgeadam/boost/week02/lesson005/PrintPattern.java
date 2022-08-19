package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class PrintPattern {

	public static void main(String[] args) {
		String answer;
		do {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Please enter a number : ");
			if(scanner.hasNextInt()) {
			int n = scanner.nextInt();
			
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j < i; j++) {
					System.out.print("* ");
				}
				System.out.println();
			}
			System.out.println("Wanna do it again ? (Y/N) ");			
			answer = scanner.next();
			}else {
				System.out.println("Wrong input!!! Wanna try it again ? (Y/N)");
				scanner.next();
				answer= scanner.next();
			}
		} while (answer.equalsIgnoreCase("Y"));
		
		
		
	}

}
