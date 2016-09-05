package com.orcle.cha;

public class Student {
		String name;
		int id;
		String grade;
		char sex;
		int age;
		String house;
		public Student(String name,int id,String grade,char sex,int age,String house){
			this.name=name;
			this.id=id;
			this.grade=grade;
			this.sex=sex;
			this.age=age;
			this.house=house;
			}
		public void sayHello(){
			System.out.println("姓名："+name+"\n"+"学号："+id+"\n"+"班级："+grade+"\n"+"性别："+sex+"\n"+"年龄："+age+"\n"+"住址："+house);
		}
		public static void main(String[] args) {
			Student s=new Student("冉行", 23, "五班", '男',23 , "陈家湾");
			Student s2=new Student("刘利", 22, "五班", '女', 45, "陈家湾");
			
			s.sayHello();
			s2.sayHello();
			
			if(s.age<s2.age){
				s.sayHello();
			}else{
				s2.sayHello();
			}
			
		}
		
}
