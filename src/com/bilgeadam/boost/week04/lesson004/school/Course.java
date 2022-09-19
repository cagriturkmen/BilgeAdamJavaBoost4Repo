package com.bilgeadam.boost.week04.lesson004.school;

public class Course {

	String name;
	String courseCode;
	String description;
	
	public Course() {
	}

	public Course(String name, String courseCode, String description) {
		super();
		this.name = name;
		this.courseCode = courseCode;
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", courseCode=" + courseCode + ", description=" + description + "]";
	}
	
	
	
	
}
