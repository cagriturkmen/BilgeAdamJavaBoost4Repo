package com.bilgeadam.boost.week04.lesson004.arrays;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		//declare an array
		int[] data;
		
		//allocate memory
		data =  new int[4];
		
		//declare and allocate
		double[] datas = new double[12];
		datas[0] =5;
		datas[6] = 7;
		
		// declare and initialize
		int[] age = {14,15,23,45};
		age[3] = 10; 		
		data[0] = 12;
		data[1] = 6;
		data[2] = 5;
				
		//System.out.println(age[4]);	
		System.out.println(Arrays.toString(datas));
		
		for(int i=0; i<age.length; i++) {
			//System.out.print(i+"'inci index: ");
		//	System.out.println(age[i]);
		//	System.out.println("dongu iceri");
		}
		//System.out.println("dongu dısarısı");
		
		for (int i : age) {
			System.out.println(i);
		}
		
	}

}
