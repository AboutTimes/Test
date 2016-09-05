package com.oracle.ch22;

import java.io.File;
import java.io.IOException;

public class FileTest1 {
	public static void main(String[] args) throws IOException {
		//指定路径
		String path="E:\\java\\file\\test.java";
		//创建File对象
		File file =new File(path);
		//创建文件
		file.createNewFile();
		//返回文件的名字
		System.out.println(file.getName());
		//返回文件的父类
		System.out.println(file.getParent());
		//返回，是否是绝对路径
		System.out.println("是否是绝对路径 :"+file.isAbsolute());
		System.out.println("判断是否是目录"+file.isDirectory());
		System.out.println("是否是文件"+file.isFile());
		//判断文件是否存在
		System.out.println(file.exists());
		//删除文件
		System.out.println(file.delete());//判断文件是否存在
		//判断文件是否存在
		System.out.println(file.exists());
		
	}
}
