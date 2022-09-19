package com.bilgeadam.boost.week04.lesson004.school;

public class Test {

	public static void main(String[] args) {
		
		Student stu = new Student();
		Course course = new Course();
		course.setCourseCode("Java101");
		course.setName("Java Introduction");
		course.setDescription("Algortihms vs vs.. Java core falann");
		Address adres = new Address("Mersin","MKA");

		
		stu.setId(1L);
		stu.setCourse(course);
		stu.setAddress(adres);
		stu.setName("Cagri");
		
		System.out.println(stu);
		
		
	}

}
