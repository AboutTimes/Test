package ch26;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Client {
	public static void main(String[] args) throws Exception {
		// 具体的角色
		// 输入流
		B b = new B();
		// b.a();
		// 节点流
		C c = new C(b);
		// c.a();
		// 过滤流
		D d = new D(c);
		// d.a();
		// 过滤流
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
