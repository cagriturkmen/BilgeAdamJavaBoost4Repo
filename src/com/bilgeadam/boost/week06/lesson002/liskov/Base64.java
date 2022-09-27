package com.bilgeadam.boost.week06.lesson002.liskov;

import com.bilgeadam.boost.week06.lesson002.openclosed.Base64Hasher;

public class Base64 extends Hashed{

	public Base64() {
		
		this.passwordHasher = new Base64Hasher();
		
	}

	
	
}
