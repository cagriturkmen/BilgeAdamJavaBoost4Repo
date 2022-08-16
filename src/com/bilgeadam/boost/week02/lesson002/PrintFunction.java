package com.bilgeadam.boost.week02.lesson002;

import javax.swing.JOptionPane;

public class PrintFunction {

	public static void main(String[] args) {
		
		String hello = "Hello";
		String world = "world";
		
//		System.out.print(hello);
//		System.out.println(world);
		
		System.out.println(hello+" "+world);
		
		//JOptionPane.showMessageDialog(null,hello,"First JOptionPane",JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showConfirmDialog(null, "Are you sure?");
		
	}

}
