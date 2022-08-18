package com.bilgeadam.boost.week02.lesson004;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {
				
		
		double height,weight, bmi;
		String gender;
		
		Scanner scanner = new Scanner(System.in);		
		
		System.out.println("Enter your weight: ");
		weight= scanner.nextDouble();
		System.out.println("Enter your height: ");
		height= scanner.nextDouble();
		System.out.println("Enter your gender(M/W): ");
		gender = scanner.next();
		
		bmi = (weight*10000)/Math.pow(height, 2);
		
		if(gender.equalsIgnoreCase("W")) {
			if(bmi<19) {
				System.out.println("Weak");
			}else if(bmi<24) {
				System.out.println("Normal");
			}else if(bmi<30) {
				System.out.println("Fat");
			}else {
				System.out.println("Obese");
			}
			
		}else if(gender.equalsIgnoreCase("M")) {
			if(bmi<20) {
				System.out.println("Weak");
			}else if(bmi<25) {
				System.out.println("Normal");
			}else if(bmi<30) {
				System.out.println("Fat");
			}else {
				System.out.println("Obese");
			}
		}else {
			System.out.println("Wrong entry.!!");
		}
			
		
	}

}
