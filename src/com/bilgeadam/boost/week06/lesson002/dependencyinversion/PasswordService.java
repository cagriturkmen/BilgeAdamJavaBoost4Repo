package com.bilgeadam.boost.week06.lesson002.dependencyinversion;

import com.bilgeadam.boost.week06.lesson002.openclosed.IPasswordHasher;

public class PasswordService {
	
	private IPasswordHasher hasher;
	
	public PasswordService(IPasswordHasher hasher) {
		this.hasher= hasher;
	}
	void hashPassword(String password) {
		this.hasher.hashPassword(password);
	}
}
