package com.bilgeadam.boost.week04.lesson001.superkeyword;

public class Dog extends Animal {
	
	String color = "black";
	
	void printColor() {
		
		System.out.println(color);
		System.out.println(super.color);
		
	}
}
