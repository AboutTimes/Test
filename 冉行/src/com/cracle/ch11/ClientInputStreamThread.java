package com.cracle.ch11;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientInputStreamThread extends Thread{
		private Socket socket;
		public ClientInputStreamThread(Socket socket){
			this.socket=socket;
		}
		public void run() {
			try {
				InputStream in=socket.getInputStream();
				
				while(true){
					byte a[]=new byte[1024];
				int length=in.read(a);
				String st=new String(a,0,length);
				System.out.println(st);
					
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
				
			

		}
		
		
}
