package com.orcle.cha2;

import java.util.ArrayList;
import java.util.List;

public class Qq {
		String name;
		int age;
		String tx;
		public Qq(String name,int age,String tx){
			this.name=name;
			this.age=age;
			this.tx=tx;
			
		}
		public  String getName(){
			return name;
		}
		public int getAge(){
			return age;
			
		}
		public String getTx(){
			return tx;
		}
		public static void main(String[] args) {
			
			 Qq qq=new Qq("����", 5, "�ϴ�");
			 Qq qq1=new Qq("����", 4, "�϶�");
			 Qq qq2=new Qq("����", 3, "����");
			 List t=new ArrayList();
			 t.add(qq);
			 t.add(qq1);
			 t.add(qq2);
			 System.out.println("����"+t.size()+"ֻ���");
			 for (int i = 0; i < t.size(); i++) {
				 Qq q=(Qq) t.get(i);
			
				System.out.println("��"+(i+1)+"ֻ��"+q.getName()+"���䣺"+q.getAge()+"�ǣ�"+q.getTx());
			 }
		}
	
		
}
