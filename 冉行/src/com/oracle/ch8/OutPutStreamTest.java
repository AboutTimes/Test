package com.oracle.ch8;

import java.io.File;
import java.io.FileOutputStream;

import java.io.OutputStream;

public class OutPutStreamTest {
	public static void main(String[] args) throws Exception {
		String name = "d:\\test\\file.txt";
		File file = new File(name);

		if (!file.exists()) {
			file.createNewFile();
		}
		OutputStream out = new FileOutputStream(file, true);
		String str = "fangxueshigedashabi";
		byte[] b = str.getBytes();
		out.write(b, 0, b.length);
		out.flush();
		out.close();

	}
}
