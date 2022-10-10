package com.bilgeadam.boost.week08.lesson001.datetimethread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		
		//server 5056 portunu dinliyor.
		ServerSocket ss = new ServerSocket(5056);
		//sunucu gelen istekleri her zaman kabul edecek durumda olmalı
		//Bu yüzden istekleri sonsuz döngü içinde beklicez.
		while(true) {
			
			Socket s = null;
			//gelen client isteklerini almak için var
			s = ss.accept();
			
			System.out.println("A new client is connected : "+ s);
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			DataOutputStream dos = new DataOutputStream(s.getOutputStream());
			
			Thread t = new ClientHandler(dis, dos, s);
			t.start();
			
		}
		
	}

}
