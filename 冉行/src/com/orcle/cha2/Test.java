package com.orcle.cha2;

public class Test {
	public static void main(String[] args) {
		Person p1=p("����","С��");
		System.out.println(p1.cat.catName);
		Person p2=p("����","С��");
		System.out.println(p2.cat.catName);
		if(p1.cat.catName.equals(p2.cat.catName)){
			System.out.println("������ͬ");
		}else{
			System.out.println("���ֲ�ͬ");
		}
		
	}

	private static Person p(String name, String catName) {
		Person p=new Person();
		p.name=name;
		Cat cat=new Cat();
		cat.catName=catName;
		p.cat=cat;
		
		return p;
	}
}
