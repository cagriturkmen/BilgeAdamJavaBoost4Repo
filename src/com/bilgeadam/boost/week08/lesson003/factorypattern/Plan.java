package com.bilgeadam.boost.week08.lesson003.factorypattern;

public abstract class Plan {
	
	protected double rate;
	protected double rate2;

	
	public void calculateBill(int units) {
		System.out.println(units*rate);
	}
	
	
	
}
