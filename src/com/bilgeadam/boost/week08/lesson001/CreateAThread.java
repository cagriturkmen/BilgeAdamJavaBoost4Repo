package com.bilgeadam.boost.week08.lesson001;

public class CreateAThread extends Thread{

	@Override
	public void run() {
		
	System.out.println("Thread is running..");
		
	}
	
	public static void main(String[] args) {
		CreateAThread thread = new CreateAThread();
		CreateAThread thread2 = new CreateAThread();

		thread.start();
		thread2.start();
	}
	
	

}
