package com.bilgeadam.boost.week08.lesson002;

public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Table obj = new Table();
		Thread1 thread1 = new Thread1(obj);
		Thread2 thread2 = new Thread2(obj);

		thread1.start();
		thread2.start();
	}
	
}
