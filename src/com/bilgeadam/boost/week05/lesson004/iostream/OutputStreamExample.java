package com.bilgeadam.boost.week05.lesson004.iostream;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class OutputStreamExample {

	public static void main(String[] args) {
		
		String data = "Bu metni dosyaya yazmak istiyorum.cagricagri";
				
		try {
			
			OutputStream output  = new FileOutputStream("output.txt");
			byte[] dataBytes = data.getBytes();
			output.write(dataBytes);
			System.out.println("Data is written to the file.");		
			output.flush();
			output.close();		
			
		} catch (Exception e) {
		e.getStackTrace();
		}
	}

}
