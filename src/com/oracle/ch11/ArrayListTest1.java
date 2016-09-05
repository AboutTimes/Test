package com.oracle.ch11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayListTest1 {
	public static void main(String[] args) {
		// 多态的表现，父类的引用可以指向子类的引用
		List list = new ArrayList();
		//接收用户输入的对象
		Scanner sc = new Scanner(System.in);
		
		// 向集合中添加元素
		for (int i = 0; i < 5; i++) {
			System.out.println("请输放一个值");
			String str=sc.next();
			list.add(str);//把输入的值添加到集合中
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));//得到集合中的元素
		}
	}
}
