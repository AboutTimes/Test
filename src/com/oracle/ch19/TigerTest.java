package com.oracle.ch19;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Set;
import java.util.TreeSet;

public class TigerTest {
	public static void main(String[] args) throws Exception {
		// ����һ��TreeSet���϶���
		Set<Tiger> set = new TreeSet<Tiger>(new MyComparator());
		// 1.
		MyComparator my = new MyComparator();
		// 2.
		Set<Tiger> set1 = new TreeSet<Tiger>(my);
		set1.add(new Tiger("С��", 1));
		System.out.println("=============");
		set1.add(new Tiger("��", 1));
		System.out.println("=============");
		set1.add(new Tiger("��1", 1));
		System.out.println("=============");
		set1.add(new Tiger("��", 1));
		System.out.println("=============");
		set1.add(new Tiger("С��", 1));

		System.out.println(set1.toString());

		// ʹ��TreeMap<K, V>��ɶ�������ӹ���
		/*
		InputStream in = new FileInputStream("1.txt");
		byte[] b = new byte[200];
		int length = 0;
		while (-1 != (length = in.read(b, 0, 200))) {
			String str = new String(b, 0, length);
			System.out.println(str);
		}*/

	}
}