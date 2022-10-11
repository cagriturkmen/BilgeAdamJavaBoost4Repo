package com.bilgeadam.boost.week08.lesson002;

public class Thread2 extends Thread{
	 
	Table table;

	public Thread2(Table table) {
		this.table = table;
	}
	
	public void run() {
		table.printTable(100);
	}
	
}
