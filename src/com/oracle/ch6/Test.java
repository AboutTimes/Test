package com.oracle.ch6;

public class Test {
	public static void main(String[] args) {
		Person p1 = p("张三", "小花");
		System.out.println(p1.cat.catName);
		Person p2 =p("李四", "大花");
		System.out.println(p2.cat.catName);
		// 我需要二个人类对象，比较猫的名字是否相同
		if (p1.cat.catName.equals(p2.cat.catName)) {
			System.out.println("名字相同");
		} else {
			System.out.println("名字不相同");
		}
	}

	public static Person p(String name, String catName) {
		// 创建人的对象
		Person p = new Person();
		// 设置属性
		p.name = name;
		// p.cat.catName = "小花";
		Cat cat = new Cat();
		// 设置猫的属性
		cat.catName = catName;
		// 需要给人的Cat属性赋值
		p.cat = cat;
		return p;
	}
}
