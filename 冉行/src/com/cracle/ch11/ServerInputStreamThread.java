package com.cracle.ch11;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ServerInputStreamThread extends Thread {
		private Socket socket;
		
		public ServerInputStreamThread(Server server){
			this.socket=socket;
		}
		@Override
		public void run() {
				
				try {
					InputStream in = socket.getInputStream();
				
				while(true){
					byte b[]=new byte[1024];
					int length=0;
					length=in.read(b);
					String str=new String(b,0,length);
					System.out.println(str);
				}
		}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
}
