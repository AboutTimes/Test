package com.cracle.ch11;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ClientOutputStreamThread extends Thread {
		private Socket socket;
		public ClientOutputStreamThread (Socket socket){
			this.socket=socket;
		}
		public void run(){
				try {
					OutputStream out=socket.getOutputStream();
					while(true){
						BufferedReader reader=new BufferedReader(
								new InputStreamReader(System.in));
						String line = reader.readLine();
						out.write(line.getBytes());
						
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
		}
}
