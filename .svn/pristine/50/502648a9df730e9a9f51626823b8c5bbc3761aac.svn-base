package com.oracle.ch25;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 过滤流的使用
 * 
 * @author Administrator
 * 
 */
public class DataOutPutStreamTest {
	/**
	 * @param args
	 * @throws IOException
	 */
	public static void main(String[] args) throws IOException {
		/*
		 * try { OutputStream out = new DataOutputStream(new FileOutputStream(
		 * new File("c:\\test.txt"))); } catch (FileNotFoundException e) {
		 * e.printStackTrace(); }
		 */
		// 文件对象
		File file = new File("c:\\test.txt");
		// 文件输出流
		FileOutputStream fo = new FileOutputStream(file);
		// 过滤流
		DataOutputStream out = new DataOutputStream(fo);

		// 写数据
		int i = 10;
		out.write(i);
		out.writeInt(i);
		// 写中文
		out.writeUTF("你好中国国国国国");
		out.flush();
		out.close();
		fo.close();

		FileInputStream fs = new FileInputStream(file);
		DataInputStream put = new DataInputStream(fs);
		System.out.println(put.read());
		System.out.println(put.readInt());
		// 读中文
		System.out.println(put.readUTF());
		// 注意事项：你写的是什么类型，就得以什么类型去读，并且面顺序要一样
	}

}
