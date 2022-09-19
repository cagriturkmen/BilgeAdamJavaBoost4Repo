package com.bilgeadam.boost.week05.lesson001.sets;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<Student> students = new TreeSet<>();
		
		Student st = new Student(101,"Mustafa",85);
		
		students.add(st);
		students.add(new Student(102,"CAGri",30));
		students.add(new Student(103,"Burcu",42));
		students.add(new Student(110,"Babur",100));
		
		for (Student student : students) {
			System.out.println(student);
		}
		
	}

}
