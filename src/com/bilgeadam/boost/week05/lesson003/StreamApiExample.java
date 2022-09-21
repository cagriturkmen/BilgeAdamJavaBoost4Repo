package com.bilgeadam.boost.week05.lesson003;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;


public class StreamApiExample {

	public static void main(String[] args) {
		
		ArrayList<Person> personList= new ArrayList<>();
		
		personList.add(new Person("Whittaker","Godleman","Male",32));
		personList.add(new Person("Merola","Wrout","Female",32));
		personList.add(new Person("Melosa","Courage","Female",14));
		personList.add(new Person("Sydney","Cullington","Female",74));
		personList.add(new Person("Sherwin","Ogley","Male",14));
		personList.add(new Person("Dukie","Malpass","Male",30));
		personList.add(new Person("Jarrett","Fearick","Male",77));
		personList.add(new Person("Willie","Childerhouse","Male",31));
		personList.add(new Person("Berky","Tollmache","Male",73));
		personList.add(new Person("Nanete","Blunsden","Female",81));
		
		
		Map<String,Integer> filteredMap = personList.stream().filter(person -> person.getAge()<50)
		.collect(Collectors.toMap(person -> person.getName(), person -> person.getAge()));
		
		filteredMap.forEach((a,b) -> System.out.println(a+"-"+b));
		
		System.out.println("-----------------------------------------------------");
		
		List<Person> filteredList = personList.stream().filter(x -> x.age<35 && x.gender.equalsIgnoreCase("Male"))
		.collect(Collectors.toList());
		
		filteredList.stream().forEach(Person::speak);
		
		System.out.println("-----------------------------------------------------");

		
		Set<Person> futureMaleList =  personList.stream()
		.filter(person -> person.gender.equalsIgnoreCase("Male"))
		.map(person -> new Person(person.getName(),person.getLastName(),person.getGender(),person.getAge()+15))
		.collect(Collectors.toSet());
		
		futureMaleList.forEach(person -> System.out.println(person));
		
	}

}
