package com.oracle.ch8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Zhende {
	public static void main(String[] args) {
		InputStream in = null;
		try {
			in = new FileInputStream("d:\\dema\\ja.txt");
		} catch (FileNotFoundException e1) {

			e1.printStackTrace();
		}
		OutputStream out = null;
		try {
			out = new FileOutputStream("d:\\dema\\tx.txt");
		} catch (FileNotFoundException e) {

			e.printStackTrace();
		}
		byte b[] = new byte[100];
		int length = 0;
		try {
			while (-1 != (length = in.read(b, 0, b.length))) {
				String str = new String(b, 0, b.length);
				System.out.println(str);
				out.write(b);
			}
		} catch (IOException e) {

			e.printStackTrace();
		}
		try {
			in.close();
			out.close();
		} catch (IOException e) {

			e.printStackTrace();
		}
	}
}
