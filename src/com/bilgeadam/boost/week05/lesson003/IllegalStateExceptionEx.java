package com.bilgeadam.boost.week05.lesson003;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IllegalStateExceptionEx {

	public static void main(String[] args) {
		
		processArray();
		
	}
	
	public static void processArray() {
		
		List<String> names = new ArrayList<>();
		
		names.add("Cagri");
		names.add("Babur");
		names.add("Babur");
		names.add("Babur");
		names.add("Babur");
		
		Iterator<String> iter = names.iterator();
		try {
			while(iter.hasNext()) {
				iter.next();
				iter.remove();
			}
		} catch (IllegalStateException e) {
		
			e.printStackTrace();
		
		}			
		System.out.println(names);	
	}	
}
