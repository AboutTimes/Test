package com.oracle.ch7;

/**
 * 动物类
 * 
 * @author Moutian
 * 
 */
public class Animal {
	private String name;
	// 语句块:就是在类中直接写上花括号
	// 1.先执行语句块
	// 2.在执行构造方法
	{
		// 完成我们很多的初始化工作。或者创建对象
		System.out.println("我是语句块");
	}
	// 静态语句块
	static {
		System.out.println("我是静态的语句块");
	}

	// 构造方法
	public Animal() {
		System.out.println("我是Animal中的隐式构造方法 ");
	}

	/**
	 * 带一个参数的构造方法
	 * 
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * 输出，
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
