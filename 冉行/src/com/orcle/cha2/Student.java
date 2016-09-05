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
				Student zjl=new Student("周杰伦", 22);
				Student yy=new Student("杨依", 21);
				List su=new ArrayList();
				su.add(zjl);
				su.add(yy);
				System.out.println("有几个学生不太老实，要好好收拾一下。估计有"+su.size()+"个");
				for (int i = 0; i < su.size(); i++) {
					Student stu=(Student) su.get(i);
					System.out.println("第"+(i+1)+"不老实学生"+ stu.getName()+"今年"+stu.getAge()+"了");
				}
			}
}
