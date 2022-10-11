package com.bilgeadam.boost.week08.lesson002;

public class Thread1 extends Thread{
	 
	Table table;

	public Thread1(Table table) {
		this.table = table;
	}
	
	public void run() {
		table.printTable(5);
	}
	
}
