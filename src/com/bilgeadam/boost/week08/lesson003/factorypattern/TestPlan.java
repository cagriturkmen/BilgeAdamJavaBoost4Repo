package com.bilgeadam.boost.week08.lesson003.factorypattern;

import java.util.Scanner;

public class TestPlan {

	public static void main(String[] args) {
		
		PlanFactory planFactory = new PlanFactory();
		
		System.out.println("Enter the name of plan you want to generate: ");
		Scanner scanner = new Scanner(System.in);
		String planName = scanner.nextLine();
		//scanner.nextLine();
		System.out.println("Enter number of units you want to caluclate for " + planName+" : ");
		int units = scanner.nextInt();
		System.out.println(units);
		Plan p = planFactory.getPlan(planName);
		
		System.out.println(" ");
		p.calculateBill(units);
	}

}
