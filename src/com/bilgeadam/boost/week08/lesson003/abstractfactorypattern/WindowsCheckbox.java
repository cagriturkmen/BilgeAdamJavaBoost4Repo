package com.bilgeadam.boost.week08.lesson003.abstractfactorypattern;

public class WindowsCheckbox implements Checkbox{

	@Override
	public void configure() {
		
		System.out.println("You have created WindowsCheckbox");
	}

}
