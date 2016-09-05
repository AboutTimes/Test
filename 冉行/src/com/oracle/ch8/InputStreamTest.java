package com.oracle.ch8;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;


public class InputStreamTest {
			public static void main(String[] args) throws Exception {
					String name="d:\\test\\file.txt";
					
					File file=new File(name);
					System.out.println(file.exists());
					InputStream input=null;
					input=new FileInputStream(file);
					byte []b=new byte[100];
					int length=0;
					while(-1 != (length = input.read(b, 0, b.length))){
						String str=new String(b,0,b.length);
						System.out.println(str);
					}
					File files=new File("d:\\test\\tes.txt");
					files.createNewFile();
					System.out.println(files.exists());
					OutputStream out=new FileOutputStream(files,true);
					String str1=new String(b,0,b.length);
					byte []c=str1.getBytes();
					out.write(c,0,c.length);
					out.flush();
					out.close();
					
			}
}
