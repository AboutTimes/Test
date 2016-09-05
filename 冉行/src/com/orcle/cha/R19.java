package com.orcle.cha;
import java.util.Scanner;
public class R19 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				System.out.println("请输入一个年份");
					int a=0;
					a=sc.nextInt();
				if(a%4==0 && a%100!=0||a%400==0){
						System.out.println("是闰年");
						}else{
							System.out.println("不是闰年");
						}
		}
}
