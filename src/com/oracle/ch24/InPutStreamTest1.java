package com.oracle.ch24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

public class InPutStreamTest1 {
	public static void main(String[] args) throws Exception {
		// 1.创建File对象
		String pathname = "E:\\test\\test.txt";
		File file = new File(pathname);
		// 2.打开流
		InputStream input = new FileInputStream(file);
		// 3.读流
		// 3.1定义一个byte数组 定义一个int类型的长度用于转换成为String类型
		byte b[] = new byte[1000];
		int length = 0;
		// length=input.read(b, 0, b.length);
		// 4.通过while操作
		while (-1 != (length = input.read(b, 0, b.length))) {
			// 5读出信息
			String str = new String(b, 0, length);
			System.out.println(str);
		}
		// 6.关闭流
		input.close();
	}
}
