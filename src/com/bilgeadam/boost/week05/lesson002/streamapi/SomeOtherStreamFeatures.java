package com.bilgeadam.boost.week05.lesson002.streamapi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SomeOtherStreamFeatures {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(25);
		list.add(12);
		list.add(3);
		list.add(89);
		list.add(25);
		list.add(44);
		list.add(100);
		list.add(7);
		list.add(63);
		
		
		
		//foreach
		list.stream().forEach(number -> System.out.println(number));
		
		//filter
		list.stream()
		.filter(number -> number > 60)
		.forEach(number -> System.out.println(number));
		
		//distinct
		list.stream()
		.distinct()
		.forEach(number -> System.out.println(number));
		
		System.out.println();
		//sorted
		list.stream()
		.sorted()
		.forEach(number -> System.out.println(number));
		
		System.out.println();
		//reverse sort
		list.stream()
		.sorted(Comparator.reverseOrder())
		.forEach(number -> System.out.println(number));
		
		System.out.println();
		//limit
		list.stream()
		.limit(5)
		.forEach(number -> System.out.println(number));
		
		System.out.println();
		
		//skip
		list.stream()
		.skip(5)
		.limit(2)
		.forEach(number -> System.out.println(number));
		System.out.println();
		
		//count
		Long count = list.stream().distinct().filter(number -> number<40).count();
		System.out.println(count);
		
		//anyMatch
		boolean match =list.stream()
		.anyMatch(number -> number==3);
		System.out.println(match);
		
		//allMatch
		boolean match2 = list.stream().allMatch(number -> number>5);
		System.out.println("Allmatch: "+match2);
		
		//noneMatch
		boolean match3 =list.stream().noneMatch(number -> number<2);
		System.out.println(match3);
		
		
	}

}
