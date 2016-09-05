package com.oracle.ch31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

/**
 * 网络连接服务器端
 * 
 * @author Administrator
 * 
 */
public class Server {
	public static void main(String[] args) throws Exception {
		// 1.创建服务器
		ServerSocket server = new ServerSocket(5000);
		// 3.侦听并接受到此套接字的连接
		Socket socket = server.accept();
		System.out.println("连接服务器成功");
		// 写到第三步，开始测试
		// 先启动服务器，在启动客户端

		// 测试成功后，向客户端发送数据
		// 4.得到一个输出流
		OutputStream ow = socket.getOutputStream();
		// 向客户端发出数据
		Scanner sc =new Scanner(System.in);
		System.out.println("请输入向客户端说的话");
		String str = sc.nextLine();
		
		ow.write(str.getBytes());
		// 7.接收客户端数据
		InputStream in = socket.getInputStream();
		byte b[] = new byte[1024];
		int length = in.read(b, 0, b.length);
		String st = new String(b, 0, length);
		System.out.println(st);
		
		socket.close();

	}
}
