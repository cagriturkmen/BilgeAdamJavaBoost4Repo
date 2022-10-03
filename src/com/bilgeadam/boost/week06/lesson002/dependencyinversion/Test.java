package com.bilgeadam.boost.week06.lesson002.dependencyinversion;

import com.bilgeadam.boost.week06.lesson002.openclosed.Base64Hasher;

public class Test {

	public static void main(String[] args) {
		Base64Hasher hasher = new Base64Hasher();
		
		PasswordService service = new PasswordService(hasher);
		
		
	}

}
