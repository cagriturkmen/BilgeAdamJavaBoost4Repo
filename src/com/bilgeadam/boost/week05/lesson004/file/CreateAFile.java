package com.bilgeadam.boost.week05.lesson004.file;

import java.io.File;
import java.io.IOException;

public class CreateAFile {

	public static void main(String[] args) {
		
		File file = new File("newFile.txt");
		
		try {
		boolean value =	file.createNewFile();
			
			if(value) {
				System.out.println("New file is created");
			}else {
				System.out.println("File already exist");
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
