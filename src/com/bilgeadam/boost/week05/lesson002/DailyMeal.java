package com.bilgeadam.boost.week05.lesson002;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DailyMeal {

	public static void main(String[] args) {
		
		
		
		String[] days = days();
		
		//String gunler = Arrays.toString(days());
		
		for (String day : days) {
			System.out.println(day + "-) "+ mainCourses()+", "+sideCourses());
		}

		
	}
	public static int randomlyPick(int number) {
		
		Random random = new Random();
	 int randomChoise=	random.nextInt(number);
	 return randomChoise;
	}
	
	
	public static String[] days() {
		
		String[] days = new String[7];
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thursday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		return days;
	}
	
	public static String mainCourses() {
		
		List<String> mainCourseList = new ArrayList<>(); 
		mainCourseList.add("Beef");
		mainCourseList.add("Chicken");
		mainCourseList.add("Kebab");
		mainCourseList.add("Rice");
		mainCourseList.add("Manti");
		mainCourseList.add("Kuru fasulye");	
		
		return mainCourseList.get(randomlyPick(mainCourseList.size()));
		
	}
	
	public static String sideCourses() {
		
		List<String> sideCourseList = new ArrayList<>();
		sideCourseList.add("Chicken Soup");
		sideCourseList.add("Tomato Soup");
		sideCourseList.add("Yayla Soup");
		
		return sideCourseList.get(randomlyPick(sideCourseList.size()));
		
	}
	

}
