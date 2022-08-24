package com.bilgeadam.boost.week03.lesson002;

public class DefineMethod {

	public static void main(String[] args) {
		
		//some code 
		int a = 5;
		int b = 4;
		
		int sonuc = sum(a,b);
		//System.out.println(sonuc);
		
		
		System.out.println(hello("Cagri","Turkmen"));
	}	
	
	public static int sum(int n1, int n2) {		
	//	int result = n1+n2;		
		return n1+n2;		
	}
	
	public static String hello(String name, String lastname) {
		
		return "Adi: "+name+"\nSoyadi: "+lastname;
		
	}

}
