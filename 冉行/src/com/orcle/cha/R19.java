package com.orcle.cha;
import java.util.Scanner;
public class R19 {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
				System.out.println("������һ�����");
					int a=0;
					a=sc.nextInt();
				if(a%4==0 && a%100!=0||a%400==0){
						System.out.println("������");
						}else{
							System.out.println("��������");
						}
		}
}
