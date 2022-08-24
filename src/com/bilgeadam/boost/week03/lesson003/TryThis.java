package com.bilgeadam.boost.week03.lesson003;

public class TryThis {
	
	//sınıfın degisken,
	int variable = 15;
	
	//sınıfın methodu
	public void method(int variable) {	
	System.out.println(this.variable);
	}
	public static void main(String[] args) {

	int variable = 10;
		
	TryThis tryThis = new TryThis();
		
	System.out.println(tryThis.variable);
	System.out.println(variable);	
	
	tryThis.method(100);
	//System.out.println(tryThis.method(34214323));
		
	}
	
	

}
