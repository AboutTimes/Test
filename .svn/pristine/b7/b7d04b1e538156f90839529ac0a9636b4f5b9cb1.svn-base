package com.oracle.ch24;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InPutStreamTest {
	public static void main(String[] args) {
		// 1.打开流
		// 2.如果有更的信息，通过while
		// 3.读流
		// 4.关闭流

		// 1。从文件中读取信息：创建一个文件对象
		String pathname = "E:\\test\\test.txt";
		File file = new File(pathname);
		// 读文件时使用FileInputStream(传入一个File对象);
		// 会出现异常
		InputStream input = null;
		try {
			// 创建对象就打开了流
			input = new FileInputStream(file);
			// 读流
			//3定义一个byte数组
			byte b[]=new byte[1000];
			//需要使用一个变量来接收返回的值,
			//把byte数组转换成为一个String
			
			int length=0;
			//通过while操作
			while(-1!=(length=input.read(b, 0, b.length))){
				//现在byte数组中已经有值
				//需要把byte数据转成字符串
				String str=new String(b,0,length);
				System.out.println(str);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				//关闭流
				input.close();
			} catch (IOException e) {
				System.out.println("关闭流出错");
				e.printStackTrace();
			}
		}

	}
}
