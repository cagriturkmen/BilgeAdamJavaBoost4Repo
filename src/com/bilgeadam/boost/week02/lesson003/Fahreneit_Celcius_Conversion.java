package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

public class Fahreneit_Celcius_Conversion {

	public static void main(String[] args) {
		
		double f;
		double c;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a fahreneit value : ");
		f= scan.nextDouble();
		
		c = (f-32)/1.8;
		
		System.out.println(c);
		scan.close();
	}

}
