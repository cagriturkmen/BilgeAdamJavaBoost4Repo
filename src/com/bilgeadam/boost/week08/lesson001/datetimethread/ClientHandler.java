package com.bilgeadam.boost.week08.lesson001.datetimethread;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ClientHandler extends Thread {
	
	DateFormat date = new SimpleDateFormat("yyyy/MM/dd");
	DateFormat time = new SimpleDateFormat("hh:mm:ss");
	
	final DataInputStream dis;
	final DataOutputStream dos;
	final Socket s;
	
	public ClientHandler(DataInputStream dis, DataOutputStream dos, Socket s) {
		super();
		this.dis = dis;
		this.dos = dos;
		this.s = s;
	}

	@Override
	public void run() {
		
		String received;
		String toReturn;
		while(true) {
		try {
			//Kulannıcıya ne yapmak istediğini sordum
			dos.writeUTF("What do you want to do?[Date | Time]..\nType Exit to exit. ");
			
			received = dis.readUTF();
			if(received.equals("Exit")) {
				System.out.println("Closing connection : " + s);
				this.s.close();
				System.out.println("Connection closed");
				break;
			}
			
			Date now = new Date();
			
			switch (received) {
			case "Date":
				toReturn = date.format(now);
				dos.writeUTF(toReturn);
				break;
			case "Time":
				toReturn = time.format(now);
				dos.writeUTF(toReturn);
				break;

			default:
				dos.writeUTF("Invalid input");
				break;
			}
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			dis.close();
			dos.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	}
}
