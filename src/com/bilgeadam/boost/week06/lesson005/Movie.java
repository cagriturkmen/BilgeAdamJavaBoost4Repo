package com.bilgeadam.boost.week06.lesson005;

public class Movie implements Comparable<Movie>{
	
	private double rating;
	private String name;
	private int year;
	
	public Movie(String name,double rating,  int year) {
		super();
		this.rating = rating;
		this.name = name;
		this.year = year;
	}

	public double getRating() {
		return rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	@Override
	public int compareTo(Movie m) {
		// TODO Auto-generated method stub
		return this.year -m.year;
	}

	@Override
	public String toString() {
		return "Movie [rating=" + rating + ", name=" + name + ", year=" + year + "]";
	}
	
	
	
}
