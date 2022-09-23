package com.bilgeadam.boost.week05.lesson005;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateAndCalendarExample {

	public static void main(String[] args) {

		long date = System.currentTimeMillis();
					
		Date date2 = new Date(date);
		
		
		Date today = new Date();
		//System.out.println(today.toString());
		
		Date twentySevenFeb2017Date = new Date(117,1,27);
		System.out.println(twentySevenFeb2017Date);
		
		Calendar twentySevenFeb2017Calendar = new GregorianCalendar(2017,1,27);
		System.out.println(twentySevenFeb2017Calendar.getTime());
		
		DateFormat ddMMyyySDF = new SimpleDateFormat("dd/MMMM/yy");
		System.out.println(ddMMyyySDF.format(twentySevenFeb2017Date));
		
	}

}
