package com.orcle.cha5;

import java.util.Scanner;

public class Java{
		
			public static void main(String[] args) {
				String name;
				String yuj;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("=====欢迎进入作业提交系统==========");
				
				System.out.println("请输入你的作业名：");
			
				 name=sc.next();
				System.out.println("请输入邮箱地址：");
				 yuj=sc.next();
				
			
			int i=name.indexOf(".");
			int s=yuj.indexOf("@");
			if(i!=-1 && i!=0 && name.substring(i+1,name.length()).equals("java")){
				System.out.println("");
				
			}else{
				System.out.println("文件名无效");
			}
			if(yuj.indexOf("@")!=-1  && yuj.indexOf('.') > yuj.indexOf('@')){
					System.out.println("");
			}else{
				System.out.println("邮箱无效");
			}
}
}
