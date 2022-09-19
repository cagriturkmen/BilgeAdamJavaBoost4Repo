package com.bilgeadam.boost.week04.lesson005.arraypractice;

public class TwoDimensionalArrayExample {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		
		//jagged array
//		arr[0] = new int[1];
//		arr[1] = new int[4];		
//		arr[2] = new int[5];
		
		int number = 1;
		//initializing jagged array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j]= number++;
			}
		}
		//printing the data of jagged array
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
