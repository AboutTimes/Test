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
				sb.append("员工的编号："+id+",");
				sb.append("员工的姓名："+name+",");
				sb.append("员工的年龄："+age);
				return sb.toString();
			}
			public static void main(String[] args) {
				List<R64> list=new ArrayList<R64>();
				list.add(new R64(3,"方雪",26));
				list.add(new R64(2,"晏钰杰",21));
				list.add(new R64(1,"朱定杰",23));
				System.out.println("排序前：");
				for (R64 r:list) {
					System.out.println(r);
				}
				System.out.println("排序后：");
				Collections.sort(list);
				for (R64 r:list) {
					System.out.println(list);
				}
				
			}
					 
}
		 