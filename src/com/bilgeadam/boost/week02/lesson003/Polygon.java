package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

//ALAN = (n*s^2)/(4*tan(pi/n))​

public class Polygon {

	static final double PI = 3.14; 
	
	public static void main(String[] args) {

		//kenar sayısı
		int n;
		//kenar uzunluğu
		double s;
		double area;
		
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter number of sides: ");
		n = scanner.nextInt();
		System.out.println("Please enter length of a side: ");
		s = scanner.nextDouble();
		
		area = (n*(Math.pow(s, 2)))/(4*(Math.tan(PI/n))); 
		System.out.println(n+" sides polygon's area : " + area);
		
	}

}
