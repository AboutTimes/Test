package ch7;

public class A {
	static {
		System.out.println("我是A类中的静态语句块");
	}
	{
		System.out.println("我是A类中语句块");
	}

	public A() {
		System.out.println("我是A类中构造方法");
	}
}
