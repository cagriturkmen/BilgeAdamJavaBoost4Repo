package com.bilgeadam.boost.week04.lesson005.lists;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListSomeOtherMethods {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		
		list.add("Cagri");
		list.add("Babur");
		list.add("Muhammed");
		list.add("Mustafa");
		
		System.out.println(list);
		
		//Reversing List
		Collections.reverse(list);
		System.out.println(list);
		
		//Sort List ascending(default)
		Collections.sort(list);
		System.out.println(list);
		
		//Sort List descending
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}

}
