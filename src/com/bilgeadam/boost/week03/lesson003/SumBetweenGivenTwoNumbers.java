package com.bilgeadam.boost.week03.lesson003;

public class SumBetweenGivenTwoNumbers {

	public static void main(String[] args) {
		
		int toplam = sum(10,11);
		System.out.println(toplam);
		
	}
	
	public static int sum(int start, int end) {
		if(end>start) {
			int a = end + sum(start,end-1);
			return a;
		}else
			return end;
	}

}
