package com.bilgeadam.boost.week05.lesson001.lists.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListAsQueue {

	public static void main(String[] args) {
		//First in first out(FIFO)
		Queue<String> languages = new LinkedList<>();
		
		//add elements
		languages.add("Java");
		languages.add("Python");
		languages.add("C++");
		System.out.println(languages);
		
		//access the first element
		String str = languages.peek();
		System.out.println("Accessed element: " + str);
		
		//access and remove the first element
		String str2 = languages.poll();
		System.out.println("Removed Elemeent: " + str2);
		System.out.println("LinkedList after poll(): " + languages);
		
		//add element at the end
		languages.offer("Swift");
		//System.out.println(isSuccessful);
		System.out.println("LinkedList after offer(): "+ languages);
	}

}
