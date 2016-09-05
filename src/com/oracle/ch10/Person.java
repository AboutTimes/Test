package com.oracle.ch10;

import java.util.Scanner;

public class Person {
	// 人的名字
	// 猫的数组
	String name;
	Cat[] cats;

	public static void main(String[] args) {
		// 创建一个人类对象
		Person person = new Person();
		// 定义一个猫的数组
		person.cats = new Cat[3];
		//输出
		person.inPut(person);
		//显示
		person.show(person);
		//排序
		person.soct(person);
		//排序后输出
		person.show(person);

	}

	private  void soct(Person person) {
		// 排序
		for (int i = 0; i < person.cats.length - 1; i++) {
		for (int j = 0; j < person.cats.length - i - 1; j++) {
		if (person.cats[j].age > person.cats[j + 1].age) {
					// 定义一个Cat对象
		Cat cat = person.cats[j];
		person.cats[j] = person.cats[j + 1];
		person.cats[j + 1] = cat;
				}
			}
		}
	}

	private  void show(Person person) {
		// 输出人的和名字和猫的信息
		person.name = "成龙";
		System.out.println(person.name);
		for (int i = 0; i < person.cats.length; i++) {
			// System.out.println(person.cats.toString());
			// 使用一个Cat类来接上数组中的Cat
			Cat cat = person.cats[i];
			System.out.println(cat.toString());
		}
	}

	private  void inPut(Person person) {
		// 接收用户输入
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < person.cats.length; i++) {
			System.out.println("请输入猫的名字");
			String name = sc.next();
			System.out.println("请输入猫的年龄");
			int age = sc.nextInt();
			Cat cat = new Cat(name, age);
			// 对人类中的猫的数组添加对象
			person.cats[i] = cat;
		}
	}
}
