package com.cracle.ch11;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
	public static void main(String[] args) {
		
		try {
			ServerSocket  server = new ServerSocket(5000);
			Socket socket=server.accept();
			System.out.println("连接服务器成功。");
			OutputStream ow = socket.getOutputStream();
			
			Scanner sc =new Scanner(System.in);
			System.out.println("请输入向客户端说的话");
			String str = sc.nextLine();
			
			ow.write(str.getBytes());
			
			InputStream in = socket.getInputStream();
			byte b[] = new byte[1024];
			int length = in.read(b, 0, b.length);
			String st = new String(b, 0, length);
			System.out.println(st);
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}	
}
