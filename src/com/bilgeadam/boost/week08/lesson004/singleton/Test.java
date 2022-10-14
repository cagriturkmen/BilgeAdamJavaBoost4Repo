package com.bilgeadam.boost.week08.lesson004.singleton;

public class Test {

	public static void main(String[] args) {
		
	LazyInitializedSingleton s1 = LazyInitializedSingleton.getInstance();
	LazyInitializedSingleton s2 = LazyInitializedSingleton.getInstance();
	
	System.out.println(s1);
	System.out.println(s2);

	}

}
