package ch26;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Client {
	public static void main(String[] args) throws Exception {
		// ����Ľ�ɫ
		// ������
		B b = new B();
		// b.a();
		// �ڵ���
		C c = new C(b);
		// c.a();
		// ������
		D d = new D(c);
		// d.a();
		// ������
		E e = new E(d);
		// e.a();

		C b1 = new C(
			   new E(
			   new D(
			   new B())));
		b1.a();

		InputStream input = 
				new BufferedInputStream(
				new DataInputStream(
				new FileInputStream(
				new File("c:\\t.txt"))));
	}
}
