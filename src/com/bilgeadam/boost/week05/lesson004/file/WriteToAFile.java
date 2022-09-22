package com.bilgeadam.boost.week05.lesson004.file;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToAFile {

	public static void main(String[] args) throws IOException {
		
		String data = "Bu metin output.txt dosyasına yazılacak.";		
		FileWriter output = null;
		try {		
		output = new FileWriter("C:\\Users\\cturk\\BilgeAdamJava4\\BilgeAdamJavaBoost4\\src\\com\\bilgeadam\\boost\\week05\\lesson004\\output.txt");
		output.write(data);			
		System.out.println("Data written to file");
		
		}catch (Exception e) {
		e.printStackTrace();
		}finally {
			output.close();
		}
	}

}
