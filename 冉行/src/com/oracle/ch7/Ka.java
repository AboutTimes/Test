package com.oracle.ch7;

import java.io.File;

public class Ka {
			public static void main(String[] args) {
				String name="d://te//se";
				File file=new File(name);
				String list[]=file.list();
				for(String n: list){
					System.out.println(n);
				}
			}
}
