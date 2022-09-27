package com.bilgeadam.boost.week06.lesson002.liskov;

public class Mercedes extends BaseCar implements SmsSendable, EmailSendable{

	@Override
	public double getCostPerKm() {
		// TODO Auto-generated method stub
		return 4.5;
	}

	@Override
	public void sendTripInfoSmsToDriver() {
		
		System.out.println("SMS:trip info");
		
	}

	@Override
	public void sendTripInfoMailToDriver() {
		// TODO Auto-generated method stub
		
	}

		
}
