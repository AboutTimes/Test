package com.orcle.cha2;
import java.util.Scanner;
public class Toms {
	
			public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				String yh;
				String mm;
				System.out.println("请输入用户名：");
				yh=sc.next();
				System.out.println("请输入密码：");
				mm=sc.next();
				if(yh.equals("Tom")&&mm.equals("123456")){
					System.out.println("输入正确");
				}else{
					System.out.println("输入错误");
				}
}
			}

