package com.orcle.cha2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dage {
				 String name;
				 int age;
				public Dage(String name,int age){
					this.name=name;
					this.age=age;
					
				}
				public String toString(){
					return this.name+this.age;
				}
				public static void main(String[] args) {
					List list=new ArrayList();
					Scanner sc=new Scanner(System.in);
					for (int i = 0; i < 4; i++) {
						System.out.println("������è�����֣�");
						String name=sc.next();
						list.add(name);
						
			
					
						/*System.out.println("������è�����䣺");
						int age=sc.nextInt();
						list.add(age);*/
						
						
							}
					
					for (int i = 0; i < list.size(); i++) {
						
						System.out.println("�ҵĵ�"+(i+1)+"ֻè:��"+list.get(i));
					}
					/*for (int j1 = 0; j1< list.size(); j1++) {
						System.out.println("����"+list.get(j1)+"����");
					}*/
				}
				
}
