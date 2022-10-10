package com.bilgeadam.boost.week08.lesson001;

public class ThreadPriorityExample extends Thread{

	public void run() {
		
		System.out.println("Current Thread name : "+ Thread.currentThread().getName());
	
	}
	
	
	public static void main(String[] args) {

		ThreadPriorityExample t1 = new ThreadPriorityExample();
		ThreadPriorityExample t2 = new ThreadPriorityExample();
		ThreadPriorityExample t3 = new ThreadPriorityExample();

		t1.start();
		t2.start();
		t3.start();
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MAX_PRIORITY);
		t3.setPriority(9);

		System.out.println(t1.getPriority()+" "+ t1.getName());
		System.out.println("After setting priority:  " + t1.getPriority());

	}

}
