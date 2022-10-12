package com.bilgeadam.boost.week08.lesson003.factorypattern.carfactory;

public class HatchbackCar extends Car {

	public HatchbackCar() {
		super(CarType.HATCHBACK);
		construct();
	}

	@Override
	void placeGasTank() {
		
		System.out.println("40L gas tank placed");
		
	}

	@Override
	void insertTyres() {

		System.out.println("Inserted 19' tyres");
		
	}

	@Override
	public String toString() {
		return "HatchbackCar [getClass()=" + getClass().getSimpleName() + "]";
	}
	

}
