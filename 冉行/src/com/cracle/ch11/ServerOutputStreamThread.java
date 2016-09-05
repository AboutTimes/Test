package com.cracle.ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerOutputStreamThread extends Thread {
			private Socket socket;
			public ServerOutputStreamThread(Socket socket){
				this.socket=socket;
			}
			public void run() {
				try{
				OutputStream ou=socket.getOutputStream();
				
				while(true){
					BufferedReader reader=new BufferedReader(
							new InputStreamReader(System.in));
					String line=reader.readLine();
					ou.write(line.getBytes());
				}
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
					
				

			}
}
