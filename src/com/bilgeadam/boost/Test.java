package com.bilgeadam.boost;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import com.bilgeadam.boost.week04.lesson001.Person;

public class Test {
public static void main(String[] args) {
	
	Set<Integer>  set = new HashSet<Integer>();
	Set<String>  set2 = new HashSet<String>();
	Person p = new Person("cagri", "turkmen", 13);
	Person p2 = new Person("cagri", "turkmen", 13);

	String a = new String("cagri");
	String b = new String("cagri");
	String c = "csd";
	Integer x = 3;
	Integer y= 4;
	//set2.add(a);
	//set2.add(b);
	set2.add(c);
	set.add(3);
	set.add(4);
	set.add(101);
	set.add(100);
	set.add((int)3.0);
	set.add(2);
	set.add(2);
	set.add(new Integer(2));
	set.add(Integer.parseInt("2"));
	System.out.println(a);
	System.out.println(b);
	System.out.println(a.hashCode() + " "+ b.hashCode()+" "+ c.hashCode());
	System.out.println(set2);
}
}
