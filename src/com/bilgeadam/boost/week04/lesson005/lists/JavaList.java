package com.bilgeadam.boost.week04.lesson005.lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaList {

	
	
	public static void main(String[] args) {
		
		//search işlemleri daha performanslı
		List<String> list1 = new ArrayList<>();		
		//manipulasyon(ekleme-çıkarma-güncelleme işlemleri daha hızlı)
		List<String> list2 = new LinkedList<>();		
		list1.add("Cagri");
		list1.add("Babur");	
	//	System.out.println(list1);		
		list2.addAll(list1);
	//	System.out.println(list2);	
	//	System.out.println( list1.get(0));	;	
	//	list1.set(0,"Hamit");		
		list1.remove(0);				
	//	System.out.println(list1.size());
		System.out.println(list1.contains("Babur"));

		
		
		
		
	}

}
