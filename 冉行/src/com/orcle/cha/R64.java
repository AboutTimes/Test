package com.orcle.cha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class R64 implements Comparable<R64>{
			private String name;
			private int age;
			private int id;
			public R64(int id,String name,int age){
				this.name=name;
				this.age=age;
				this.id=id;
			}
			public int compareTo(R64 o) {
				if(id>o.id){
					return 1;
				}else if(id<o.id){
					return -1;}
				return 0;
				}
			public String toString(){
				StringBuilder sb=new StringBuilder();
				sb.append("Ա���ı�ţ�"+id+",");
				sb.append("Ա����������"+name+",");
				sb.append("Ա�������䣺"+age);
				return sb.toString();
			}
			public static void main(String[] args) {
				List<R64> list=new ArrayList<R64>();
				list.add(new R64(3,"��ѩ",26));
				list.add(new R64(2,"���ڽ�",21));
				list.add(new R64(1,"�춨��",23));
				System.out.println("����ǰ��");
				for (R64 r:list) {
					System.out.println(r);
				}
				System.out.println("�����");
				Collections.sort(list);
				for (R64 r:list) {
					System.out.println(list);
				}
				
			}
					 
}
		 