package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class ChineseZodiac {


	public static void main(String[] args) {
		String answer;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Please enter your birth year : ");
			
			int birthYear = scan.nextInt();
			int mod = birthYear%12;
			String zodiac = "";
			
			switch (mod) {
			case 0:
				zodiac = "Monkey";
				break;
			case 1:
				zodiac = "Rooster";
				break;
			case 2 :
				zodiac = "Dog";
				break;
			case 3 :
				zodiac = "Pig";
				break;
			case 4 :
				zodiac = "Mouse";
				break;
			case 5 :
				zodiac = "Ox";
				break;
			case 6 :
				zodiac = "Tiger";
				break;
			case 7 :
				zodiac = "Rabbit";
				break;
			case 8 :
				zodiac = "Dragon";
				break;
			case 9 :
				zodiac = "Snake";
				break;
			case 10 :
				zodiac = "Horse";
				break;
			case 11 :
				zodiac = "Goat";
				break;
			default:
				System.out.println("Hatalı giriş.!");
				break;
			}
			System.out.println("Your Chinese Zodiac is "+zodiac);
			System.out.println("Do you wanna try again ?(Y/N)");
			answer = scan.next();
		} while (answer.equalsIgnoreCase("Y"));
		
	}

}
