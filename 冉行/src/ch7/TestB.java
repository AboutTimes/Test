package ch7;

public class TestB {
	public static void main(String[] args) {
		B b = new B();
		// 现在是如何执行的
		// 1. 分别执行父类和子类中的静态语句块
		// 2. 执行父类中的语句块，构造方法
		// 3. 执行子类中的语句块，构造方法
		System.out.println("===============");
		B b1 = new B();
		//在第二次创建对象【实例化时】执行
		// 2. 执行父类中的语句块，构造方法
		// 3. 执行子类中的语句块，构造方法
	}
}
