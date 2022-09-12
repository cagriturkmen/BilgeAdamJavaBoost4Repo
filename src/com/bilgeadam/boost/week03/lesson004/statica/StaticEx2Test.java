package com.bilgeadam.boost.week03.lesson004.statica;

public class StaticEx2Test {

	public static void main(String[] args) {
		
		StaticEx2 obj = new StaticEx2();
		//non statice eriştim
		System.out.println(obj.min);
		
		System.out.println(StaticEx2.max);
		
		
	}

}
