package com.bilgeadam.boost.week06.lesson002.liskov;

public class BMW extends BaseCar implements EmailSendable{

	@Override
	public double getCostPerKm() {
		// TODO Auto-generated method stub
		return 5;
	}

	

	@Override
	public void sendTripInfoMailToDriver() {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
}
