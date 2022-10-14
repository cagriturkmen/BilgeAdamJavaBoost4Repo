package com.bilgeadam.boost.week08.lesson004.singleton;

public class EagerInitializedSingleton {
		
	private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
	
	private EagerInitializedSingleton() {
		
	}
	
	public static EagerInitializedSingleton getInstance() {
		return instance;
	}
	
	
}
