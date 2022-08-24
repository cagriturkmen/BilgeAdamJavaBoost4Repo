package com.bilgeadam.boost.week02.lesson005;

import java.util.Scanner;

public class TuncayRegister {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String userNameData = null;
		String passwordData = null;
		String userName;
		String password;
		
		int choice = 0;
		boolean registered = false;
		
		
		while(choice != 1 && choice != 2 ) {
			
		System.err.println("########## HOME PAGE ################");	
			
		System.out.println("#Login: (Press 1)");
		System.out.println(((registered) ? "#Change Your User Name or Password" : "#Register") + (" (Press 2)")) ;
		System.out.print("Your choice: ");
		choice = scan.nextInt();
		
			if(choice == 1) {
				System.out.println("-LOGIN SCREEEN---------------------------------------");
				if(userNameData == null || passwordData == null) {
				
					System.err.println("You have register first");
					choice = 0;
					
				}else {
					
					System.out.print("Enter your User Name: ");
					userName = scan.next();
					System.out.print("Enter your Password: ");
					password = scan.next();
					
					if(userName.equals(userNameData) && password.equals(passwordData)) {
						while(choice != 3) {
							System.out.println("Succesfull Login");
							System.out.print("For Logout (Press 3) ");
							choice = scan.nextInt();
						}
					}
					else {
						System.out.println("Wrong User Name or Password");
					}
				}
			}			
			if(choice == 2) {				
				System.out.println("-REGISTER / CHANGE SCREEN----------------");
				
				if(!registered) {					
					System.out.print("Create a User Name= ");
					userNameData = scan.next();
					System.out.print("Create a Password= ");
					passwordData = scan.next();
					
					registered = true;
					choice = 0;
				}				
				else {
					System.out.print("Change your User Name= ");
					userNameData = scan.next();
					System.out.print("Change your Password= ");
					passwordData = scan.next();
					
					choice = 0;
				}
			}								
		}			
		scan.close();
	}

}
