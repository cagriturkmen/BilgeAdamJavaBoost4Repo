package com.bilgeadam.boost.week05.lesson005;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		
		LocalDateTime curreDateTime = LocalDateTime.now();
		System.out.println(curreDateTime);
		
		curreDateTime = curreDateTime.minusMonths(5);
		System.out.println(curreDateTime);
		
	}
	
}
