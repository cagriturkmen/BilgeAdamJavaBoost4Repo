package com.bilgeadam.boost.week08.lesson002;

public class Table {
	
	 void printTable(int n) {
		synchronized (this) {
			for (int i = 0; i < 5; i++) {
				System.out.println(n*i);
				try {
					Thread.sleep(400);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	
		
	}
	
}
