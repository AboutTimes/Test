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
						System.out.println("请输入猫的名字：");
						String name=sc.next();
						list.add(name);
						
			
					
						/*System.out.println("请输入猫的年龄：");
						int age=sc.nextInt();
						list.add(age);*/
						
						
							}
					
					for (int i = 0; i < list.size(); i++) {
						
						System.out.println("我的第"+(i+1)+"只猫:叫"+list.get(i));
					}
					/*for (int j1 = 0; j1< list.size(); j1++) {
						System.out.println("今年"+list.get(j1)+"岁了");
					}*/
				}
				
}
