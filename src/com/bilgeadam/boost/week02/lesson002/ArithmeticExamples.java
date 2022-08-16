package com.bilgeadam.boost.week02.lesson002;

import java.util.Scanner;

public class ArithmeticExamples {

	public static void main(String[] args) {
		//number = sayi
		// number diye bir sayı değeri içerecek bir değişken yarattım
		int number;
		//Scanner sınıfıını kullanarak bir tarayıcı nesne oluşturdum(scan). scan ile kullanıcı girişini okuyacağım.
		Scanner scan = new Scanner(System.in);
		//Kullanıcıya ne yapmasını istediğğime dair bir mesaj gösterdim.
		System.out.print("Please enter a number: ");
		//Kullanıcının yaptığı girişi okuyup number değişkenime kaydettim.
		number = scan.nextInt();		
		//number değişkeninin içinde artık kullanıcının girmiş olduğu değer var.
		//number'ı yazdırdım.
		System.out.println("Number you choose:  "+ number);
		
		
		
	}

}
