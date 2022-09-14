package com.bilgeadam.boost.week04.lesson002.polymorphism;

public class Test {

	public static void main(String[] args) {
		
		Animal pig = new Pig();
		Animal dog = new Dog();
		
		pig.animalSound();
		dog.animalSound();
		
	}

}
