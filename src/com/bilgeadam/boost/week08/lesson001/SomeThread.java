package com.bilgeadam.boost.week08.lesson001;

public class SomeThread implements Runnable {
public void run() {
		System.out.println("Current Thread name : "+ Thread.currentThread().getName());
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println();
	
	}
}
