package com.bilgeadam.boost.week06.lesson005;

import java.util.ArrayList;
import java.util.Collections;

public class MovieTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));
        
     //   Collections.sort(list);
        Collections.sort(list ,new RatingCompare());
        for (Movie movie : list) {
			System.out.println(movie);
		}
 
	}

}
