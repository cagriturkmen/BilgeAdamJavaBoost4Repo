package com.bilgeadam.boost.week08.lesson001;

public class ThreadState implements Runnable{
	
	public static Thread t1;
	public static ThreadState ts;
	
	@Override
	public void run() {

		SomeThread someThread = new SomeThread();
		Thread t2 = new Thread(someThread);
		t2.start();
		System.out.println("t2 start olduktan sonra state : " + t2.getState());
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("t2 sleep calistiktan sonra state: " + t2.getState());
		
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("t2 join yapıktan sonra state : " + t2.getState());
	}

	
	public static void main(String[] args) throws InterruptedException {
		
		ts = new ThreadState();
		t1 = new Thread(ts);
		
		t1.start();
		
	}


}
