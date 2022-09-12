package com.bilgeadam.boost.week04.lesson001.inheritance;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		computer.setBrand("Monster");
		computer.setOperatingSystem("Windows");
		computer.setRamSize(32);
		computer.setScreenSize(13.2);
		computer.setSsdCapacity(512);
		
		//computer.showFeatures();
		//computer.connectWeb();
	
		Computer computer2 = new Computer("Dell",16,256,12.0,"Linux");
		computer2.showFeatures();
		
		Laptop laptop = new Laptop("Apple",16,128,14.4,"MacOS",100);
		laptop.showFeatures();
		
		Laptop laptop2 = new Laptop();
		laptop2.setBrand("Acer");
		laptop2.setBatteryCapacity(50);
		laptop2.stateOfCharge();
		
		Desktop desktop = new Desktop();
		desktop.setBrand("Casper");
		desktop.connectWeb();
	}
}
