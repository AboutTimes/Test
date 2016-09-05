package com.oracle.ch7;

import java.io.File;

public class Ru {
			public static void main(String[] args) {
				File f=new File("d://te//se");
				query(f);
			}
			
			public static void query(File file){
				if(file.isFile()||file.list().length==0){
					return;
				}else{
					File files[]=file.listFiles();
					for(File f:files){
						if(f.isFile()){
							System.out.println("\t"+f.getName());
						}else{
							System.out.println("\t"+f.getName()+"//");
						}
						if(f.isDirectory()){
							query(f);
						}
					}
				}
			}
}
