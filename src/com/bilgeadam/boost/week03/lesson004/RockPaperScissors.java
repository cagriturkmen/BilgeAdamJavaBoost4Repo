package com.bilgeadam.boost.week03.lesson004;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Rock,Paper, Scissors");
		int user = 0;
		int computer = 0;		
		
		while(user<2&&computer<2) {
		System.out.println("What is your next move? (rock-paper-scissors-quit)");
		String userMove = input.nextLine();
		
		if(userMove.equalsIgnoreCase("quit")) {
			System.out.println("gg");
			break;
		}else if(!userMove.equalsIgnoreCase("rock") && !userMove.equalsIgnoreCase("paper")&& !userMove.equalsIgnoreCase("scissors")) {
			System.out.println("Your move is not valid");
		}else {
			Random random = new Random();
			int rand = random.nextInt(3);
			
			String computerMove;
			if(rand==0) {
				computerMove="rock";
			}else if(rand==1) {
				computerMove="paper";
			}else {
				computerMove="scissors";
			}
			System.out.println("Computer's move : "+ computerMove);
			if(userMove.equalsIgnoreCase(computerMove)) {
				System.out.println("It's a tie!");
				System.out.println(user+"-"+computer);
			}else if(userMove.equals("rock")&&computerMove.equals("scissors")
					||userMove.equals("scissors")&&computerMove.equals("paper")
					||userMove.equals("paper")&&computerMove.equals("rock")) {
				System.out.println("You won");
				user++;
				System.out.println(user+"-"+computer);
			}else {
				System.out.println("You lost");
				computer++;
				System.out.println(user+"-"+computer);
			}
		}	
	} System.out.println("gg");
	}
}
