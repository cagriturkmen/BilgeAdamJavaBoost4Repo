package com.bilgeadam.boost.week03.lesson003.outside;

import com.bilgeadam.boost.week03.lesson003.AccessModifiers;

public class OutsideAccess extends AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers testObject = new AccessModifiers();
		System.out.println("Erisebildigim degiskenler : " + testObject.publicVariable);
		
		
		OutsideAccess testObj = new OutsideAccess();
		
		System.out.println("Erisebildigim degiskenler : " + testObj.protectedVariable+ testObj.publicVariable);
	}

}
