package com.bilgeadam.boost.codility;

public class YanyanaGelmeyenKarakterler {

	public static void main(String[] args) {
		String s = "";
		int[] arr ;
	}
    public int solution(String S, int[] C) {
    	int sum=0;
    	for (int i = 0; i < S.length()-1; i++) {			
    		if(S.charAt(i)==S.charAt(i+1)) {
    			if(C[i]<C[i+1]) {
    				sum = sum+ C[i];
    			}else {
    				sum = sum+ C[i+1];
    			}
    		}
    		
		}
    	return sum;
    }

}
