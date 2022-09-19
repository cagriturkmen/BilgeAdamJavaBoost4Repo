package com.bilgeadam.boost.week04.lesson004.interfaceArea;

//						IS-A
public class Square implements Calculatable,Drawable{
	
	int a=3;
	int b=2;
	int c;
	@Override
	public double calculateArea() {
		c= a+b;
		return c;
	}
	@Override
	public void draw() {
		
		System.out.println("drawing square");
		
	}

}
