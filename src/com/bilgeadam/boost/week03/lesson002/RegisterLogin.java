package com.bilgeadam.boost.week03.lesson002;

import java.util.Scanner;

public class RegisterLogin {
	
	public static void main(String[] args) {
		String userName="";
		String password="";

		do {
			System.out.println("1-Register\n2-Login\n3-Exit");
			Scanner scan = new Scanner(System.in);
			int key = scan.nextInt();
			scan.nextLine();
			switch (key) {
			case 1:
				//Scanner input = new Scanner(System.in);
				System.out.println("Welcome to register page!! Please enter a username : ");
				userName = scan.nextLine();
				System.out.println("Please enter a password : ");
				password = scan.nextLine();
				System.out.println("Your account is created. ");
				break;
			case 2:
				//Scanner scanner = new Scanner(System.in);
				System.out.println("Enter your username : ");
				String userNameEntry = scan.nextLine();
				System.out.println("Enter your password : ");
				String passwordEntry = scan.nextLine();
				
				if(userNameEntry.equals(userName) && passwordEntry.equals(password)) {
					System.out.println("Welcome!!!");
					
				}else {
					System.out.println("Wrong username or password");
				}
				
				break;
			case 3:
				System.exit(1);
				break;
			default:
				break;
			}
		} while (true);
		
	
		
	}

}
