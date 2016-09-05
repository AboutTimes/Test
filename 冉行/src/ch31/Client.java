package ch31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * 客户端
 * 
 * @author Administrator
 * 
 */
public class Client {
	public static void main(String[] args) throws Exception, IOException {

		// 如果是你在自己的电脑上测试可以写127.0.0.1
		// 以下的是我电脑的IP你们自己电脑的Ip请使用ipconfig
		String host = "192.168.0.35";
		// 端口号
		int port = 5000;
		// 2.创建客户端
		Socket socket = new Socket(host, port);

		// 5.客户端接收服务器发过来的数据
		InputStream in = socket.getInputStream();
		int length = 0;
		byte b[] = new byte[1024];
		/*
		 * while (-1 != (length = in.read(b, 0, b.length))) { String str = new
		 * String(b, 0, length); System.out.println(str); }
		 */
		length = in.read(b, 0, b.length);
		String str = new String(b, 0, length);
		System.out.println(str);
		// 写完第五步测试

		// 6.向服务器发出数据
		OutputStream ow = socket.getOutputStream();
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入向服务器端说的话");

		// 这里是不是可以接收用户的输入
		String st = sc.nextLine();
		ow.write(st.getBytes());
		socket.close();
	}
}
