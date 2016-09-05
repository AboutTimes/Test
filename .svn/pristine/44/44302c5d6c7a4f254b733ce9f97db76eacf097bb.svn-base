package com.oracle.ch28;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableTest {
	public static void main(String[] args) throws IOException, Exception {
		// 1.实现序列化：创建对象
		Person person = new Person("李小龙", 18);
		String path = "c:\\ts.txt";
		// 2.创建一个文件输出流
		FileOutputStream fs = new FileOutputStream(path);
		// 创建一个Object输出流
		ObjectOutputStream os = new ObjectOutputStream(fs);
		os.writeObject(person);
		os.close();

		for (int i = 0; i < 10; i++) {
			// 输出该序列化的对象:反序列化
			FileInputStream fs1 = new FileInputStream(path);
			ObjectInputStream os1 = new ObjectInputStream(fs1);
			// 从文件中把对象读出来
			Person p = null;

			p = (Person) os1.readObject();
			System.out.println(p.name);
			System.out.println(p.age);
			System.out.println(p.str);
			os1.close();
		}

	}
}
