package com.oracle.ch7;

import java.io.File;

public class See {
		public static void main(String[] args) {
			File file=new File("d:"+File.separator+"te"+File.separator+"se");
			File file2=new File("d:");
			String list[]=file.list();
			System.out.println();
			System.out.println(file.exists());
			System.out.println(file.isFile());
			System.out.println(file2.isDirectory());
			System.out.println(file2.length());
			
			for(String name:list){
				System.out.println(name);
			}
		}
		
}
