package com.bilgeadam.boost.week05.lesson005;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {
		
		ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.systemDefault());
		System.out.println(zonedDateTime);
		
		ZoneId berlinGermany = ZoneId.of("Europe/Istanbul");
		ZonedDateTime berlinZone = ZonedDateTime.of(LocalDateTime.now(), berlinGermany);
		System.out.println(berlinZone);
	}

}
