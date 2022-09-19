package com.bilgeadam.boost.week04.lesson003.aggregation;

public class Test {

	public static void main(String[] args) {
		
		Address adres = new Address("sisli","istanbul","turkiye",34000);
		Student student = new Student("Cagri", 10000, adres);
		
		Student stu = new Student();
		stu.name="burak";
		stu.rollNo=100;
		System.out.println(stu);	
	//	System.out.println(student);		
	}
}
