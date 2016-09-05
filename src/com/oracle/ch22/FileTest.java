package com.oracle.ch22;

import java.io.File;
import java.io.IOException;

/**
 * 文件的操作
 * 
 * @author Administrator
 * 
 */
public class FileTest {
	public static void main(String[] args) {
		//这里写的路径叫做绝对路径
		String pathname = "E:\\java\\file\\file.txt";
		// 指定文件的路径是E盘下的java文件夹下的file.txt【需要我们创建的】
		// "E:/java/file"
		File file = new File(pathname);
		//操作文件时都会出现一个IOException
		boolean flag=false;
		try {
			//创建一个文件并且是空的文件
			flag=file.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(flag);
		
	}
}







