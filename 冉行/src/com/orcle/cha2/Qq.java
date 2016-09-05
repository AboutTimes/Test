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
			
			 Qq qq=new Qq("大胖", 5, "老大");
			 Qq qq1=new Qq("二胖", 4, "老二");
			 Qq qq2=new Qq("三胖", 3, "老三");
			 List t=new ArrayList();
			 t.add(qq);
			 t.add(qq1);
			 t.add(qq2);
			 System.out.println("共有"+t.size()+"只企鹅");
			 for (int i = 0; i < t.size(); i++) {
				 Qq q=(Qq) t.get(i);
			
				System.out.println("第"+(i+1)+"只叫"+q.getName()+"年龄："+q.getAge()+"是："+q.getTx());
			 }
		}
	
		
}
