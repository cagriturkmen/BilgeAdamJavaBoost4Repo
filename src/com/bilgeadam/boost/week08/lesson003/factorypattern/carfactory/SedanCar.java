package com.bilgeadam.boost.week08.lesson003.factorypattern.carfactory;

public class SedanCar extends Car {

	public SedanCar() {
		super(CarType.SEDAN);
		construct();
	}

	@Override
	void placeGasTank() {
		
		System.out.println("50L gas tank placed");
		
	}

	@Override
	void insertTyres() {

		System.out.println("Inserted 21' tyres");
		
	}

}
