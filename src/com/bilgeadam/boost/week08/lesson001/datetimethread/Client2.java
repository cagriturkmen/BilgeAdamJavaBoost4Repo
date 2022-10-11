package com.bilgeadam.boost.week08.lesson001.datetimethread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client2 {

	public static void main(String[] args) throws UnknownHostException, IOException {
	try {
		Scanner scanner = new Scanner(System.in);
		
		//localhost üstünde 5056 portuınu socketimin kullanımına açtım.
		Socket s = new Socket("localhost",5055);
		
		//input ve output streamleri elde ettim
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
//bu döngünün içinde client ile client handler arasındaki bilgi alışverişini gerçekleştireceğim.
		while(true) {	
			
            System.out.println(dis.readUTF());
			String toSend = scanner.nextLine();
			dos.writeUTF(toSend);
		
			if(toSend.equals("Exit")) {
				System.out.println("Closing connection : " + s);
				s.close();
				System.out.println("Connection closed");
				break;
			}
			String received = dis.readUTF();
			System.out.println(received);
			
		}
		
		scanner.close();
		dis.close();
		dos.close();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}		
	}
}
