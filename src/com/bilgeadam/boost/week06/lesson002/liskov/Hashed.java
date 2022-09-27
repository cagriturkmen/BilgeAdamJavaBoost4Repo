package com.bilgeadam.boost.week06.lesson002.liskov;

import com.bilgeadam.boost.week06.lesson002.openclosed.IPasswordHasher;

public abstract class Hashed {

	IPasswordHasher passwordHasher;
	String hashedPassword;
	
	public void generateHash(String password) {
		
		hashedPassword = passwordHasher.hashPassword(password);
		
	}
	
}
