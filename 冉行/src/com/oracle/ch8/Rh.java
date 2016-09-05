package com.oracle.ch8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class Rh {
	public static void main(String[] args) throws Exception {

		InputStream input = new FileInputStream("d:\\test\\file.txt");
		OutputStream out = new FileOutputStream("d:\\test\\yy.txt");
		byte[] b = new byte[100];
		int i = 0;
		while (-1 != (i = input.read(b, 0, b.length))) {
			String str = new String(b);
			System.out.println(str);
			out.write(b);
		}
		input.close();
		out.close();

	}
}
