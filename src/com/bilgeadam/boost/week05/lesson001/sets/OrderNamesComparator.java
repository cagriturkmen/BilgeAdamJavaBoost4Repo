package com.bilgeadam.boost.week05.lesson001.sets;

import java.util.Comparator;

public class OrderNamesComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o2.getGrade()-o1.getGrade();
		//return o1.getName().compareToIgnoreCase(o2.getName());
	}



}
