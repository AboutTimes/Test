package ch31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * �ͻ���
 * 
 * @author Administrator
 * 
 */
public class Client {
	public static void main(String[] args) throws Exception, IOException {

		// ����������Լ��ĵ����ϲ��Կ���д127.0.0.1
		// ���µ����ҵ��Ե�IP�����Լ����Ե�Ip��ʹ��ipconfig
		String host = "192.168.0.35";
		// �˿ں�
		int port = 5000;
		// 2.�����ͻ���
		Socket socket = new Socket(host, port);

		// 5.�ͻ��˽��շ�����������������
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
		// д����岽����

		// 6.���������������
		OutputStream ow = socket.getOutputStream();
		Scanner sc = new Scanner(System.in);
		System.out.println("���������������˵�Ļ�");

		// �����ǲ��ǿ��Խ����û�������
		String st = sc.nextLine();
		ow.write(st.getBytes());
		socket.close();
	}
}
