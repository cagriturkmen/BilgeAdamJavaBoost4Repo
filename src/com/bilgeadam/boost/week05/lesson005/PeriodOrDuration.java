package com.bilgeadam.boost.week05.lesson005;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodOrDuration {

	public static void main(String[] args) {
		
		//Period -Duration in day week month year
		Period examplePeriod = Period.of(1, 1, 1);
		Period.ofWeeks(4);
		
		System.out.println(examplePeriod);
		
		System.out.println(LocalDate.now().plus(examplePeriod));;
		
		//Duration - days hours minutes seconds
		
		Duration exampleDuration = Duration.ofHours(5);
		System.out.println(LocalDateTime.now().plus(exampleDuration));		
		
		Period p= Period.between(LocalDate.of(2017, 10, 25),LocalDate.now());
		
		long p2 = ChronoUnit.DAYS.between(LocalDate.of(2017, 10, 25),LocalDate.now());
		
		
		System.out.println("You are " + p.getYears() + " years, " + p.getMonths() +
		                   " months, and " + p.getDays() +
		                   " days old. (" + p2 + " days total)");
	}
	
}
