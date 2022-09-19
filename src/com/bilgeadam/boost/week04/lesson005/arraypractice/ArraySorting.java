package com.bilgeadam.boost.week04.lesson005.arraypractice;

public class ArraySorting {
	//{3,7,3,12,43,54,43,28,3,19,-24,-19}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] array = {3,7,3,12,43,54,43,28,3,19,-24};
		//Dizinin küçükten büyüğe sıralanmış hali
		int temp;
		for(int i = 0; i < array.length; i++)
        {
            for(int j = i+1; j < array.length; j++)
            {
                if(array[j] < array[i]) {
                	temp = array[i];
                	array[i] = array[j];
                	array[j] = temp;
                }
            }
        }
        for(int i = 0; i < array.length; i++)
        {
            System.out.println("Dizinin " + (i+1) + ". elemanını : " + array[i]);
        }
	}
}
