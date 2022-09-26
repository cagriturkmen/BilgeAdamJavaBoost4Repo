package com.bilgeadam.boost.week06.lesson001;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class I18NTime {

	public static void main(String[] args) {
		printTime(Locale.UK);
		printTime(Locale.US);
		printTime(Locale.CANADA);
		printTime(Locale.CHINA);
		printTime(Locale.FRANCE);
		printTime(Locale.GERMANY);
		printTime(Locale.JAPAN);		
			
	}
	
	
	static void printTime(Locale locale) {
		
		DateFormat formatter = DateFormat.getTimeInstance(DateFormat.DEFAULT,locale);
		Date currentDate = new Date();
		
		String time = formatter.format(currentDate);
		System.out.println(time+" "+locale);
		
	}
	

}
