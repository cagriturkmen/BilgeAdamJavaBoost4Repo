package com.bilgeadam.boost.week08.lesson003.factorypattern.carfactory;

public class JeepCar extends Car {

	public JeepCar() {
		super(CarType.JEEP);
		construct();
	}

	@Override
	void placeGasTank() {
		
		System.out.println("60L gas tank placed");
		
	}

	@Override
	void insertTyres() {

		System.out.println("Inserted 23' tyres");
		
	}

}
