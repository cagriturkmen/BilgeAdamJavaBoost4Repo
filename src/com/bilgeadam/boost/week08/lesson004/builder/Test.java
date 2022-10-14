package com.bilgeadam.boost.week08.lesson004.builder;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer comp = new Computer.ComputerBuilder("500gb", "2gb").setGraphicsCardEnabled(true).build();
		
		System.out.println(comp);
		
	}

}
