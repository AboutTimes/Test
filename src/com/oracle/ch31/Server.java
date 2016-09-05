package com.oracle.ch31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.xml.ws.handler.MessageContext.Scope;

/**
 * �������ӷ�������
 * 
 * @author Administrator
 * 
 */
public class Server {
	public static void main(String[] args) throws Exception {
		// 1.����������
		ServerSocket server = new ServerSocket(5000);
		// 3.���������ܵ����׽��ֵ�����
		Socket socket = server.accept();
		System.out.println("���ӷ������ɹ�");
		// д������������ʼ����
		// ���������������������ͻ���

		// ���Գɹ�����ͻ��˷�������
		// 4.�õ�һ�������
		OutputStream ow = socket.getOutputStream();
		// ��ͻ��˷�������
		Scanner sc =new Scanner(System.in);
		System.out.println("��������ͻ���˵�Ļ�");
		String str = sc.nextLine();
		
		ow.write(str.getBytes());
		// 7.���տͻ�������
		InputStream in = socket.getInputStream();
		byte b[] = new byte[1024];
		int length = in.read(b, 0, b.length);
		String st = new String(b, 0, length);
		System.out.println(st);
		
		socket.close();

	}
}
