package com.bilgeadam.boost.week04.lesson004.school;

public class Student extends Person {

	private Course course;

	public Student() {
		super();
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course çağrı) {
		this.course = çağrı;
	}

	@Override
	public String toString() {
		return "Student [course=" + course + ", id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
	
	
	
	
	
}
