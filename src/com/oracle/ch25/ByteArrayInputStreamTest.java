package com.oracle.ch25;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamTest {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = "abcckdsfklsdfjdsf";
		byte[] b = str.getBytes();
		ByteArrayInputStream read = new ByteArrayInputStream(b);
		byte b1[] = new byte[1000];
		int length = 0;
		
		ByteArrayInputStream re=new ByteArrayInputStream(b,0,2);
		
		while (-1 != (length = re.read(b1, 0, b1.length))) {
			String st=new String(b1,0,length);
			System.out.println(st);
		}
		
		//System.out.println(read.read());
	}

}
