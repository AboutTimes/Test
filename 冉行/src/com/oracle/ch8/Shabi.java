package com.oracle.ch8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;



public class Shabi {
		

		public static void main(String[] args) {
			File file =new File("d:\\dema");
			file.mkdir();
			System.out.println(file.exists());
			OutputStream out=null;
			try {
				out=new FileOutputStream("d:\\dema\\ja.txt");
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			
			String str=new String("方雪是个大傻逼");
			byte []b=str.getBytes();
			int length=0;
			try {
				out.write(b);
				out.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			
		}
}
