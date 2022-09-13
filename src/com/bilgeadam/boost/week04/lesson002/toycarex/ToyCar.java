package com.bilgeadam.boost.week04.lesson002.toycarex;

import java.util.Scanner;

public class ToyCar {

	private int batteryCapacity;
	private int distanceTravelledForward;
	private int distancetravelledRight;
	
	
	//No argument constrcutor
	public ToyCar() {
		this.batteryCapacity = 5;
		this.distanceTravelledForward=0;
		this.distancetravelledRight=0;
	}
	
	
	//All arguments constructor
//	public ToyCar(int batteryCapacity, int distanceTravelledForward, int distancetravelledRight) {
//		this.batteryCapacity = batteryCapacity;
//		this.distanceTravelledForward = distanceTravelledForward;
//		this.distancetravelledRight = distancetravelledRight;
//	}
	
	void initToyCar() {
		
		ToyCar toycar = new ToyCar();
		boolean exit = true;
		while(exit) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("w-Move Forward\na-Move Left\ns-Move Backward\nd-Move Right\nc-Charge\ne-Exit\nWhat you gonna do?");
		String move = scanner.nextLine();
		
		switch (move.toLowerCase()) {
		case "w":
			toycar.moveOneMeterForward();
			break;
		case "a":
			toycar.moveOneMeterLeft();
			break;
		case "s":
			toycar.moveOneMeterBackward();
			break;
		case "d":
			toycar.moveOneMeterRight();
			break;
		case "c":
			toycar.charge();
			break;	
		case "e":
			exit=false;
			break;
		default:
			System.out.println("Invalid entry!!!");
			break;
		}
	}
	}
	private void remainingBattery() {
		System.out.println("Remaining Battery : " + batteryCapacity);
		if(batteryCapacity<=0) {
			System.out.println("Dead Battery! Please charge");
		}
	}
	private void currentPosition() {
		System.out.println("Current Position : " + distanceTravelledForward+" ," + distancetravelledRight);
	}
	
	private void charge() {	
		if(batteryCapacity>=5) {
			System.out.println("Battery Full!");
		}else {
			batteryCapacity++;
			remainingBattery();
		}
	}
	private void moveOneMeterForward() {
		if(batteryCapacity<=0) {
		}else {
		distanceTravelledForward++;
		batteryCapacity--;
		currentPosition();
		}
		remainingBattery();
	}
	private void moveOneMeterRight() {
		if(batteryCapacity<=0) {
		}else {
		distancetravelledRight++;
		batteryCapacity--;
		currentPosition();
		}
		remainingBattery();
	}
	private void moveOneMeterLeft() {
		if(batteryCapacity<=0) {
		}else {
		distancetravelledRight--;
		batteryCapacity--;
		currentPosition();
		}
		remainingBattery();
	}
	private void moveOneMeterBackward() {
		if(batteryCapacity<=0) {
		}else {
		distanceTravelledForward--;
		batteryCapacity--;
		currentPosition();
		}
		remainingBattery();
	}


	public int getBatteryCapacity() {
		return batteryCapacity;
	}


	public void setBatteryCapacity(int batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}


	public int getDistanceTravelledForward() {
		return distanceTravelledForward;
	}


	public void setDistanceTravelledForward(int distanceTravelledForward) {
		this.distanceTravelledForward = distanceTravelledForward;
	}


	public int getDistancetravelledRight() {
		return distancetravelledRight;
	}


	public void setDistancetravelledRight(int distancetravelledRight) {
		this.distancetravelledRight = distancetravelledRight;
	}
	
	
	
}
