package com.orcle.cha2;
import java.util.Scanner;
public class Girls {
		String name;
		int age;
		
		public Girls(String name,int age){
			this.name=name;
			this.age=age;
			
		}
		public String toString(){
			return this.name+this.age;
		}
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("������è�����֣�");
			
			Girls girls[]=new Girls[4];
			for (int i = 0; i < girls.length; i++) {
				System.out.println("����");
					String name=s.next();
				System.out.println("����");
					int age=s.nextInt();
					
					Girls c=new Girls(name,age);
					girls[i]=c;
						}
				for (int i = 0; i < girls.length; i++) {
					Girls c=girls[i];
					System.out.println("����˵ĵ�"+(i+1)+"ֻè��"+"����Ϊ��"+c.age+"�꣬"+"����Ϊ��"+c.name);
						}
				}
		}
