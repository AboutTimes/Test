package com.oracle.ch4;

/**
 * 静态的使用static,他可以修饰方法属性，类
 * 
 * @author Administrator
 * 
 */
public class StaticTest {
	// 属性static
	// 修饰属性时，我们的所有对象都使用该属性
	static int PI;

	public static void t() {
		System.out.println("t");
	}

	public static void main(String[] args) {
		// 对于静态属性的使用，直接使用类名点属性
		StaticTest.PI = 33;
		System.out.println(StaticTest.PI);
		// 静态的属性和方法不需要创建对象，直接通过类名点属性或者方法
		//静态的方法 可以直接调用静态的方法
		//静态的方法中不能直接调用非静态的方法 
		t();
		StaticTest.t();
	}
}
