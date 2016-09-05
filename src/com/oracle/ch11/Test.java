package com.oracle.ch11;

public class Test {
	public static void main(String[] args) {
		// 1. 创建实例
		Test test = new Test();
		Test test2 = new Test();
		// 比较二个对象是否相等,他们的引用地址是不一样的
		System.out.println(test == test2);
		test2 = test;
		System.out.println(test==test2);
		//需求：分别创建二个对象，让他们使用==后的结果为true
		
	}
}
