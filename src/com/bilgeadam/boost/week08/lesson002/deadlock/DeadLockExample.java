package com.bilgeadam.boost.week08.lesson002.deadlock;

public class DeadLockExample {

	public static void main(String[] args) {
		
		String resource1 = "cagri";
		String resource2 = "turkmen";
		
		Thread thread1 = new Thread() {
			public void run() {			
				synchronized (resource1) {
					System.out.println("Thread1 : locked resource 1");
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (resource2) {
					System.out.println("Thread1 : locked resource 2");
				}
				}				
			}
		};
		Thread thread2 = new Thread() {
			public void run() {
				synchronized (resource2) {
				System.out.println("Thread2 : locked resource 2");	
				
				synchronized (resource1) {
				System.out.println("Thread 2 : locked resource 1");	
				}
				}
			}
		};	
		
		thread1.start();
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread2.start();
		
	}

}
