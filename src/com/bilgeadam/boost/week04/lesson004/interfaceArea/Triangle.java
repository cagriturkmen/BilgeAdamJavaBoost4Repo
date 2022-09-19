package com.bilgeadam.boost.week04.lesson004.interfaceArea;

public class Triangle implements Calculatable, Drawable{

	int x;
	int y;
	
	@Override
	public double calculateArea() {
		
		//triangle area calucaltion implementation
		
		return 0;
	}

	@Override
	public void draw() {
		
		System.out.println("drawing triangle");
		
	}

	
}
