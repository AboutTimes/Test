package com.oracle.ch8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class NB {
	public static void main(String[] args) throws Exception {
		File file1 = new File("d:\\test\\te.txt");
		File file2 = new File("d:\\test\\te.txt");
		File file3 = new File("d:\\test\\tk.txt");
		// ����� ����ļ� ���ļ����������
		OutputStream out = new FileOutputStream(file1);
		if (!file1.exists()) {
			file1.createNewFile();
		}
		String str = "demaxiyawansui";
		byte[] a = str.getBytes();
		out.write(a, 0, a.length);
		out.flush();
		out.close();
		// ������ �鿴�ļ���������
		InputStream input = new FileInputStream(file2);
		System.out.println(file2.exists());
		byte[] b = new byte[100];
		int length = 0;
		while (-1 != (length = input.read(b, 0, b.length))) {
			String str1 = new String(b, 0, b.length);
			System.out.println(str1);
		}
		// ������ ���ļ��ڵ�������ӵ��½��ļ���ȥ
		System.out.println(file3.exists());
		if (!file3.exists()) {
			file3.createNewFile();
		}
		OutputStream tu = new FileOutputStream(file3);

		String str2 = new String(b, 0, b.length);
		byte c[] = str2.getBytes();
		tu.write(c);
		tu.flush();
		tu.close();

	}
}
