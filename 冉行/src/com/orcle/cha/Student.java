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
			System.out.println("������"+name+"\n"+"ѧ�ţ�"+id+"\n"+"�༶��"+grade+"\n"+"�Ա�"+sex+"\n"+"���䣺"+age+"\n"+"סַ��"+house);
		}
		public static void main(String[] args) {
			Student s=new Student("Ƚ��", 23, "���", '��',23 , "�¼���");
			Student s2=new Student("����", 22, "���", 'Ů', 45, "�¼���");
			
			s.sayHello();
			s2.sayHello();
			
			if(s.age<s2.age){
				s.sayHello();
			}else{
				s2.sayHello();
			}
			
		}
		
}
