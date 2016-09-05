package com.oracle.ch8;

public class C {
	static {
		System.out.println("C静态语句块");
	}
	{
		System.out.println("C语句块");
	}

	public C() {
		System.out.println("C中的构造方法");
	}
}
