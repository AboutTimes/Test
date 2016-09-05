package com.orcle.cha;
import java.util.Scanner;
public class R20 {
	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		Scanner b=new Scanner(System.in);
			int i;
			int o;
			System.out.println("请输入用户名：");
				i=a.nextInt();
			System.out.println("请输入登录密码：");
				o=b.nextInt();
				if(i==123&&o==123){
					System.out.println("输入正确，欢迎光临！");
				}else{
					System.out.println("输入错误，请重试。");
				}
	}
}
