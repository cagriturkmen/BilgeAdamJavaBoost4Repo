package com.bilgeadam.boost.week08.lesson003.factorypattern.carfactory;

public abstract class Car {
	
	private CarType model;
	
	public Car(CarType model) {
		super();
		this.model = model;
	}
	
	abstract void placeGasTank();
	abstract void insertTyres();
	
	protected void construct() {
		placeGasTank();
		insertTyres();
	}
	
}
