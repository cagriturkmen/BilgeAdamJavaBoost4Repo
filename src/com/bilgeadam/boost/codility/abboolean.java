package com.bilgeadam.boost.codility;

public class abboolean {

	public static void main(String[] args) {
		
		String s = "aaaa";
	System.out.println(solution(s));	
		
	}
	public static boolean solution(String S) {
		
		for (int i = 0; i < S.length(); i++) {
			
			if(S.charAt(i)=='b') {
				for (int j = i; j < S.length(); j++) {
					if(S.charAt(j)=='a') {
						return false;
					}
				}
				
				
			}
		}
		return true;

    }

}
