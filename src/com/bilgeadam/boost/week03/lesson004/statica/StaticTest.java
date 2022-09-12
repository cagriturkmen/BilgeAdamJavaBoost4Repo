package com.bilgeadam.boost.week03.lesson004.statica;

public class StaticTest {

	public static void main(String[] args) {
		
		//add methoduna statik olduğu için doğrudan ulaşabildim.
		System.out.println(StaticEx.add(3, 5)); ;
		
		StaticEx obj = new StaticEx();
		//Multiply metodu statik olmadığı için bu metoda erişebilmek
		//için metodun bulunduğu sınıfın bir instance'ını ürettim
		System.out.println(obj.multiply(3, 5));	
		//obj.add(3, 5);
		
	}

}
