package com.oracle.ch6;

import java.util.Set;
import java.util.TreeSet;

public class Dema {
		String name;
		int age;
		public Dema(){
			
		}
		public Dema(String name,int age){
			super();
			this.name=name;
			this.age=age;
		}
		public static void main(String[] args) {
			Set<Dema> set=new TreeSet<Dema>(new My());
			
			My my=new My();
			Set<Dema> set1=new TreeSet<Dema>(my);
			set1.add(new Dema("며",22));
			set1.add(new Dema("며",21));
			set1.add(new Dema("며",20));
			set1.add(new Dema("며",19));
			set1.add(new Dema("며",18));
			System.out.println(set1);
			
		}
}
