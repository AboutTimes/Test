package com.orcle.cha5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Mn {
	
		String name;
		int age;
		String xb;
		public Mn(String name,int age,String xb){
			this.name=name;
			this.age=age;
			this.xb=xb;
		}
		public String getName(){
			return name;
		}
		public int getAge(){
			return age;
		}
		public String getXb(){
			return xb;
		}
		
		public static void main(String[] args) {
			 List list=new ArrayList();
			
			 Scanner sc=new Scanner(System.in);
			 	Mn mn=new Mn("��Ů", 22, "��˾����");
			 	Mn mn1=new Mn("����", 15, "�˼Һܿɰ�");
			 	Mn mn2=new Mn("����", 28, "С�ܱܵ��£����������");
			 	Mn mn3=new Mn("�ٸ�", 30, "���ö���̫����");
			 	
			 	list.add(mn);
			 	list.add(mn1);
			 	list.add(mn2);
			 	list.add(mn3);
			 	
			 	System.out.println("˧�磡��ϲ��ʲô�����أ�����������"+list.size()+"����ͬ���͵�o");
			 	for (int i = 0; i < list.size(); i++) {
			 		Mn q=(Mn) list.get(i);
					System.out.println("����"+q.getName()+"\t"+q.getAge()+"\t"+q.getXb());
				}
			 	
			 	System.out.println("---------------------------------------");
			 	System.out.println("��ѡ����ϲ����");
			 	String t=sc.next();
			 	/*if(t=="��Ů"){
			 		System.out.println("����"+list.get(0)+"\t"+list.get(0)+"\t"+list.get(0));
			 	}else if(t=="����"){
			 		System.out.println("����"+list.get(1)+"\t"+list.get(1)+"\t"+list.get(1));
			 	}else if(t=="����"){
			 		System.out.println("����"+list.get(2)+"\t"+list.get(2)+"\t"+list.get(2));
			 	}else if(t=="�ٸ�"){
			 		System.out.println("����"+list.get(3)+"\t"+list.get(3)+"\t"+list.get(3));
			 	}*/
		}
		
		
		
}
