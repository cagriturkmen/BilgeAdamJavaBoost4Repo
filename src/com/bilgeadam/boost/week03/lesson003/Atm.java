package com.bilgeadam.boost.week03.lesson003;

import java.util.Scanner;

public class Atm {
	
	static boolean endProgram = true;
	static boolean endMenu =true;
	static final String username = "user";
	static final String password = "123";
	static int count = 3;
	static double balance = 1500;
	static double amount;
	static Scanner scanner = new Scanner(System.in);
	
	public static void depositCash() {
		
		System.out.println("Please enter amount of depositted cash : ");
		amount = scanner.nextDouble();
	//	balance = balance+amount;
		balance+=amount;
		System.out.println(amount + " is depositted to your balance. Your final balance: " +balance );
		
	} 
	
	public static void withdrawCash() {
		System.out.println("Please enter amount of withdraw cash : ");
		amount = scanner.nextDouble();
		if(amount>balance) {
			System.out.println("You dont have enough money.");
		}else {
			//balance = balance-amount;
			balance -=amount;
			System.out.println(amount + " is withdrawed from your balance. Your final balance: " +balance );
		}					
	}
	public static void showBalance() {
		System.out.println("Your balance : " +balance);

	}

	
	public static void main(String[] args) {
		
		
		while(true) {
			
			System.out.println("Please enter your username : ");
			String usernameEntry = scanner.nextLine();
			System.out.println("Please enter your password : ");
			String passwordEntry = scanner.nextLine();
			
			if(!usernameEntry.equals(username) || !passwordEntry.equals(password)) {
				//yanlış girerse
				System.out.println("Wrong username or password.!");
				count--;
				
				if(count==0) {
					System.out.println("Your card is blocked. PLease contact 4444444. ");
					//endProgram=false;
					break;
				}else {
					System.out.println("Remaining attempt : " + count);
				}	
			}else {
				//doğru girerse
				count = 3;
				while(endMenu) {
				System.out.println("Welcome" + username);
				System.out.println("1-)Deposit cash\n2-)Withdraw cash\n3-)Balance information\n4-)Exit");
				int selection =scanner.nextInt();
				
				switch (selection) {
				case 1:
					depositCash();
					break;
				case 2:
					withdrawCash();
					break;
				case 3:
					showBalance();
					break;
				case 4:
					endMenu =false;
					break;
				case 5:
					System.exit(0);

				default:
					System.out.println("Invalid input.!	!!");
					break;
				}
				}
			}
			
		}
		
	
		
	}

}
