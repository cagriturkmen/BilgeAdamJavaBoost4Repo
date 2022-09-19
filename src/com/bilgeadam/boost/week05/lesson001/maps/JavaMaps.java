package com.bilgeadam.boost.week05.lesson001.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class JavaMaps {

	public static void main(String[] args) {

		//creating a map using the hashmap
		
		Map<String, Integer> numbers = new HashMap<>();
		numbers.put("One", 1);
		numbers.put("Two", 2);
		numbers.put("Nine", 15);
		
		System.out.println(numbers);
		
		System.out.println(numbers.keySet());
		
		System.out.println(numbers.values());
		
		Set<Entry<String, Integer>> numbers2 = numbers.entrySet();
		
		System.out.println(numbers.entrySet()); 
		
		int value = numbers.remove("Nine");
		System.out.println(value);
		
		System.out.println( numbers.get("One"));;
		
		
			
		
		
		
		
		
		
	}

}
