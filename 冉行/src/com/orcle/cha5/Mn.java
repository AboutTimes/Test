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
			 	Mn mn=new Mn("美女", 22, "我司大波妹");
			 	Mn mn1=new Mn("萝莉", 15, "人家很可爱");
			 	Mn mn2=new Mn("御姐", 28, "小弟弟别怕，姐姐会疼你的");
			 	Mn mn3=new Mn("少妇", 30, "不用对我太温柔");
			 	
			 	list.add(mn);
			 	list.add(mn1);
			 	list.add(mn2);
			 	list.add(mn3);
			 	
			 	System.out.println("帅哥！你喜欢什么样的呢，我们这里有"+list.size()+"个不同类型的o");
			 	for (int i = 0; i < list.size(); i++) {
			 		Mn q=(Mn) list.get(i);
					System.out.println("我是"+q.getName()+"\t"+q.getAge()+"\t"+q.getXb());
				}
			 	
			 	System.out.println("---------------------------------------");
			 	System.out.println("请选择你喜欢的");
			 	String t=sc.next();
			 	/*if(t=="美女"){
			 		System.out.println("我是"+list.get(0)+"\t"+list.get(0)+"\t"+list.get(0));
			 	}else if(t=="萝莉"){
			 		System.out.println("我是"+list.get(1)+"\t"+list.get(1)+"\t"+list.get(1));
			 	}else if(t=="御姐"){
			 		System.out.println("我是"+list.get(2)+"\t"+list.get(2)+"\t"+list.get(2));
			 	}else if(t=="少妇"){
			 		System.out.println("我是"+list.get(3)+"\t"+list.get(3)+"\t"+list.get(3));
			 	}*/
		}
		
		
		
}
