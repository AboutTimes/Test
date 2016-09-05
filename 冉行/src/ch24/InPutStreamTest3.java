package ch24;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

//输放流，并缓冲的功能{过滤流}
public class InPutStreamTest3 {
	public static void main(String[] args) throws Exception {

		// InputStream input = new FileInputStream(file);
		// 需要添加缓冲的功能
		// InputStream input =new BufferedInputStream(new
		// FileInputStream(file));
		File file = new File("c:\\test.doc");
		// 文件输入流
		FileInputStream in = new FileInputStream(file);
		// 带缓冲功能的输入流
		InputStream input = new BufferedInputStream(in);
		// 合并在一起的写法
		// InputStream inputs = new BufferedInputStream(new FileInputStream(new
		// File("c:\\test.doc")));

		byte[] b = new byte[1000];
		int length = 0;
		while (-1 != (length = input.read(b, 0, b.length))) {
			String str = new String(b, 0, length);
			System.out.println(str);
		}

	}
}
