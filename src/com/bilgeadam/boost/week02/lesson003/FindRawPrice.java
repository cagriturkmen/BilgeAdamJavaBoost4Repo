package com.bilgeadam.boost.week02.lesson003;

import java.util.Scanner;

public class FindRawPrice {

	public static void main(String[] args) {
		
		double endPrice, priceWithoutVat, rawPrice, tax, profit;
		
		tax= 18;
		profit = 15;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter product end price: ");
		endPrice = scan.nextDouble();
		priceWithoutVat =(endPrice*100)/(100+tax);
		rawPrice = (priceWithoutVat*100)/(100+profit);
		System.out.println("Product's raw price is : " + rawPrice);
		
		scan.close();
	}

}
