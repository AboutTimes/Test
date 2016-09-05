package com.oracle.ch22;

import java.io.File;
import java.io.FilenameFilter;

public class FileTest4 {
	public static void main(String[] args) {
		File file = new File("E:\\java\\5.10");
		// 需要使用内部类的方式实现
		String[] files = file.list(new FilenameFilter() {
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".java")) {
					return true;
				}
				return false;
			}
		});
		for(String name:files){
			System.out.println(name);
		}
	}
}
