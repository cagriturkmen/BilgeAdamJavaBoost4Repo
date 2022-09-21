package com.bilgeadam.boost.week05.lesson003;

import java.util.InputMismatchException;
import java.util.Scanner;

import javax.crypto.NullCipher;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		try {			
			String a = scanner.nextLine();			
			int myInt = Integer.parseInt(a);
			System.out.println(myInt);
			
		}catch (NumberFormatException  e) {
			e.printStackTrace();
			System.out.println("Stop trying convert a text to a number");		
		}catch(NullPointerException | InputMismatchException e) {
			e.printStackTrace();
		}finally {
			System.out.println("finally block");
		}						
	}
}
