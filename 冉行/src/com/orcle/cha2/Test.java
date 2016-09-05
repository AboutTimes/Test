package com.orcle.cha2;

public class Test {
	public static void main(String[] args) {
		Person p1=p("张三","小花");
		System.out.println(p1.cat.catName);
		Person p2=p("李四","小菜");
		System.out.println(p2.cat.catName);
		if(p1.cat.catName.equals(p2.cat.catName)){
			System.out.println("名字相同");
		}else{
			System.out.println("名字不同");
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
