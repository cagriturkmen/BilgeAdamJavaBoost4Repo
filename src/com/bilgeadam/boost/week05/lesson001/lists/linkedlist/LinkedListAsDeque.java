package com.bilgeadam.boost.week05.lesson001.lists.linkedlist;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class LinkedListAsDeque {

	public static void main(String[] args) {
		
		//Hem FIFO HEM LIFO olarak kullanılabilir.
		Deque<String> animals = new LinkedList<>();
		
		animals.add("Dog");
		animals.add("Cat");
		animals.add("Pig");
		animals.add("Giraffe");
		animals.add("Elephant");
		animals.add("Penguin");
		animals.add("Monkey");
		animals.add("Orca");
		animals.add("Whale");
		animals.add("Bear");
		
		System.out.println(animals);
		animals.addFirst("Human");
		System.out.println("Animals after addFirst(): "+ animals);
		animals.addLast("Zebra");
		System.out.println("Animals after addLast(): "+ animals);
		
        // removes and return the first element of the deque.
		animals.pop();
		System.out.println("Animals after pop(): "+ animals);
		
		animals.removeFirst();
		animals.removeLast();
		System.out.println(animals);
		
	}

}
