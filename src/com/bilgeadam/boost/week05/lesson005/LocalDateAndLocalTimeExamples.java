package com.bilgeadam.boost.week05.lesson005;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateAndLocalTimeExamples {

	public static void main(String[] args) {
		
		LocalDate currentLocalDate = LocalDate.now();
		System.out.println(currentLocalDate);
		
		
		LocalDate twentySevenFeb2017LocalDate = LocalDate.of(2017, 2, 27);
		System.out.println(twentySevenFeb2017LocalDate);
		
		twentySevenFeb2017LocalDate = twentySevenFeb2017LocalDate.withYear(2023).withMonth(12).withDayOfMonth(13);
		System.out.println(twentySevenFeb2017LocalDate);
		
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        System.out.println(formatter.format(twentySevenFeb2017LocalDate));
        
        //plus days/weeks/&months/years
        twentySevenFeb2017LocalDate = twentySevenFeb2017LocalDate.plusDays(1);
        System.out.println(twentySevenFeb2017LocalDate);
        
        LocalTime currentLocalTime = LocalTime.now();
        System.out.println(currentLocalTime);
        
        LocalTime parseLocalTime = LocalTime.parse("13:40");
        System.out.println(parseLocalTime);
        
        int a =LocalDate.now().compareTo(twentySevenFeb2017LocalDate);
        System.out.println(a);
        
        
	}

}
