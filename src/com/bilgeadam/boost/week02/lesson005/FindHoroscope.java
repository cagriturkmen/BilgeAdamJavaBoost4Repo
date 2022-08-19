package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class FindHoroscope {

	public static void main(String[] args) {	
	
		findHoroscope();
		
	}
	public static void findHoroscope() {
		String horoscope="";
		boolean check= true;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your birth month : ");
		int month = scanner.nextInt();
		System.out.println("Please enter your birth day");
		int day = scanner.nextInt();
				
		if(month==1) {
			if(day<=21) {
				horoscope = "Capricorn";
			}else if(day<=31){
				horoscope= "Aquarius";
			}else {
				check=false;
			}
		}else if(month==2) {
			if(day<=19) {
				horoscope="Aquarius";
			}else if(day<= 28) {
				horoscope= "Balık";
			}else {
				check=false;
			}
		}else if (month == 3)	
			{
				if (day <= 20) {
					horoscope = "Balık";
				} else if (day <= 31) {					
					horoscope = "Koç";
				}				
				else {
					check = false;
				}				
			} else if (month == 4) {
				if (day <= 20) {
					horoscope = "Koç";
				} else if (day <= 30) {					
					horoscope = "Boğa";
				}			
				else {
					check = false;
				}				
			} else if (month == 5) {
				if (day <= 21) {
					horoscope = "Boğa";
				} else if (day <= 31) {
					horoscope = "İkizler";
				}			
				else {
					check = false;
				}				
			} else if (month == 6) {
				if (day <= 22) {
					horoscope = "İkizler";
				} else if (day <= 30) {
					horoscope = "Yengeç";
				} else {
					check = false;
				}
			}			
			else if (month == 7) {
				if (day <= 22) {
					horoscope = "Yengeç";
				} else if (day <= 31) {
					horoscope = "Aslan";
				}
				else {
					check = false;
				}				
			} else if (month == 8) {
				if (day <= 22) {
					horoscope = "Aslan";
				} else if (day <= 31) {
					horoscope = "Başak";
				}				
				else {
					check = false;
				}				
			} else if (month == 9) {
				if (day <= 22) {
					horoscope = "Başak";
				} else if (day <= 30) {
					horoscope = "Terazi";
				} else {
					check = false;
				}			
			} else if (month == 10) {
				if (day <= 22) {
					horoscope = "Terazi";
				} else if (day <= 30) {
					horoscope = "Akrep";
				}			
				else {
					check = false;
				}			
			} else if (month == 11) {
				if (day <= 21) {
					horoscope = "Akrep";
				} else if (day <= 30) {
					horoscope = "Yay";
				}
				
				else {
					check = false;
				}		
			} else if (month == 12) {
				if (day <= 21) {
					horoscope = "Yay";
				} else if (day <= 31) {
					horoscope = "Oğlak";
				} else {
					check = false;
				}	
	}else {
		System.out.println("Yıldaki ay sayısı 12'dir 12den büyük girme..!!");
	}if(check) {
		System.out.println(horoscope);
	}else {
		System.out.println("Geçerli bir gün sayısı gir!!!");
	}
	
	}
}
