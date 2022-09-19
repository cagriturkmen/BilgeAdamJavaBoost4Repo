package com.bilgeadam.boost.week05.lesson001.sets;

import java.util.HashSet;
import java.util.Iterator;

public class JavaSets {

	public static void main(String[] args) {
		
		// f(x) = x^3 * mod7 * sqrt(x)
		//155543526
		
		HashSet<String> set = new HashSet<>();
		
		set.add("Berna");
		set.add("Eralp");
		set.add("Can");
		set.add(null);
		
	//	set.remove("Berna");
		set.size();
		set.contains("Berna");
		
		for (String name : set) {
			System.out.println(name);
		}
		
		
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			
			System.out.print(iter.next());
		}
		
		
	}

}
