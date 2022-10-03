package com.bilgeadam.boost.week07.lesson001;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2way {
	
	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket s = new Socket("localhost",3333);
		DataInputStream din = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "";
		String str2 = "";
		
		while(!str.equals("exit")) {
			str=br.readLine();
			if(!str.equals("exit")) {
				dout.writeUTF(str);
				dout.flush();
				str2 = din.readUTF();
				System.out.println("Server says : " + str2);
			}
		}
		din.close();
		dout.close();
		s.close();

	}

}
