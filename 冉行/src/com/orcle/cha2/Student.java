package com.orcle.cha2;

import java.util.ArrayList;
import java.util.List;

public class Student {
			String name;
			int age;
			public Student(String name,int age){
				this.name=name;
				this.age=age;
			}
			
			public String getName(){
				return name;
				
			}
			public int getAge(){
				return age;
				
			}
			public static void main(String[] args) {
				Student zjl=new Student("�ܽ���", 22);
				Student yy=new Student("����", 21);
				List su=new ArrayList();
				su.add(zjl);
				su.add(yy);
				System.out.println("�м���ѧ����̫��ʵ��Ҫ�ú���ʰһ�¡�������"+su.size()+"��");
				for (int i = 0; i < su.size(); i++) {
					Student stu=(Student) su.get(i);
					System.out.println("��"+(i+1)+"����ʵѧ��"+ stu.getName()+"����"+stu.getAge()+"��");
				}
			}
}
