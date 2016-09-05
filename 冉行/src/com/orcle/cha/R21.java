package com.orcle.cha;
import java.util.Scanner;
public class R21 {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			Scanner sa=new Scanner(System.in);
			System.out.println("请输入新员工姓名：");
				String name=sc.next();
			
			System.out.println("请输入应聘编程语言：");
				int a;
				a=sa.nextInt();
			switch(a){
			case 1:
				System.out.println("哈希吗");
				break;
			case 2:
				System.out.println("的吗");
				break;
			case 3:
				System.out.println("德玛西亚");
				break;
			
			}
	}
}
