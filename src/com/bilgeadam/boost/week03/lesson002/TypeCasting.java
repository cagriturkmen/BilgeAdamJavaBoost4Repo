package com.bilgeadam.boost.week03.lesson002;

public class TypeCasting {

	public static void main(String[] args) {
		
		//widening
		int myInt = 9;
		double myDouble = myInt; //Automatic casting : int to double
		
		//System.out.println(myInt);
		//System.out.println(myDouble);
		
		//narrowing
		double myDouble2 = 9.99d;
		int myInt2 = (int) myDouble2; //Manuel casting : double to int
		
//		System.out.println(myDouble2);
//		System.out.println(myInt2);
		
		/////////////////////
		//Type conversion from int to String
		int num = 10;
		System.out.println("The integer value is : " +num);
		
		String data = String.valueOf(num); //converts int to String //int değeri String değere çeviriyorum
		System.out.println("The string value is : " + data);
		
		//int result = data + 5;
		
		//Type conversion from String to int
		String data2 = "15";
		System.out.println("The string value is : " + data2);
		
		Integer num2 = Integer.parseInt("15");// converts String to int
		System.out.println("The integer value is : " +num2);
		
//		Integer num3 = new Integer(15);
//		if(num2==(num3)) {
//			System.out.println("Tuncay");
//		}
		

		
		
	}

}
