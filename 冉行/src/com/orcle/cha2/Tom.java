package com.orcle.cha2;

import java.util.Scanner;

public class Tom {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String yh;
			String mm;
			System.out.println("请输入用户名：");
			yh=sc.next();
			System.out.println("请输入密码：");
			mm=sc.next();
			if(mm.length()>=6){
				System.out.println("注册成功");
			}else{
				System.out.println("密码长度必须大于6位");
			}
		}
}
