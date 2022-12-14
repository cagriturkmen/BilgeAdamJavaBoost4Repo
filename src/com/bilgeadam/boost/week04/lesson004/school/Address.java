package com.bilgeadam.boost.week04.lesson004.school;

public class Address {

	private String city;
	String street;
	
	public Address(String city, String street) {
		super();
		this.city = city;
		this.street = street;
	}	

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", street=" + street + "]";
	}
	
	
	
	
	
}
