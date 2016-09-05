package com.oracle.ch4;

public class Static2 extends Static1 {
	// 使用static修饰方法后，在继承中不能使用
	// ，这里就不叫方法重写
	public static void t() {
		System.out.println("tt");
	}

	public static void main(String[] args) {
		Static2 s = new Static2();
		Static2.t();
		Static1.t();
	}
}
