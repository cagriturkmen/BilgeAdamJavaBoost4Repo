package com.bilgeadam.boost.week05.lesson001.hw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OddsEvens {

	/*
	 * 1'den 100'e kadar olan sayıların çift olanlarını bir array'e​

	Kalanını başka bir array'e ekle.​

	10'dan küçük çift sayıları sil.​

	 * */
	
	public static void main(String[] args) {
		
	int[] evens = new int[50];
	 int[] odds = new int[50];
	 
	 int j= 0;
	 int k= 0;
	 for (int i = 1; i < 100; i++) {
		 
		 if(i%2==0) {
			 evens[j]=i;
			 j++;
		 }else {
			 odds[k] =i;
			 k++;
		 }		 		
	}	 
	 
	 List tempList = new ArrayList<>();
	 
	 for (int i = 0; i < evens.length; i++) {
		if(evens[i]>9) {
			tempList.add(evens[i]);
		}
	}	
	 for (Object object : tempList) {
		System.out.print(object +" ");
	}
//	 System.out.println(Arrays.toString(evens));
//	 System.out.println(Arrays.toString(odds));		
		
	}

}
