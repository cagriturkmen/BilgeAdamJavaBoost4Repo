package com.bilgeadam.boost.twoqriteriasearch;

public class Person {
	private String memberName;
	private String memberMail;
	private String id;
	private static int numOfPerson = 0;
	
	
	
	public Person() {
		super();
	}
	
	public Person(String memberName, String memberMail, String id) {
		super();
		this.memberName = memberName;
		this.memberMail = memberMail;
		this.id = id;
	}
	
	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getMemberMail() {
		return memberMail;
	}

	public void setMemberMail(String memberMail) {
		this.memberMail = memberMail;
	}

	@Override
	public String toString() {
		return "Person [memberName=" + memberName + ", memberMail=" + memberMail + ", id=" + id + "]";
	}
}
