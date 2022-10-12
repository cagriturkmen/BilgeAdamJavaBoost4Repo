package com.bilgeadam.boost.week08.lesson003.factorypattern.carfactory;

public class Test {

	public static void main(String[] args) {
		
	System.out.println(CarFactory.buildCar(CarType.HATCHBACK));	;
	System.out.println(CarFactory.buildCar(CarType.HATCHBACK));	;
	System.out.println(CarFactory.buildCar(CarType.SEDAN));	;
	System.out.println(CarFactory.buildCar(CarType.JEEP));	;

	}

}
