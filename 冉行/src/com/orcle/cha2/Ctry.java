package com.orcle.cha2;

public class Ctry {
		String name;
		int age;
		public Ctry(String name,int age){
			this.name=name;
			this.age=age;
		}
		public static void main(String[] args) {
			Ctry ctr[]=new Ctry[3];
			for (int i = 0; i < ctr.length; i++) {
				Ctry c=new Ctry("Сè"+2, i); 
				ctr[i]=c;
			}
		}
}
