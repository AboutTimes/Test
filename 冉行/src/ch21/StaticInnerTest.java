package ch21;

import ch21.StaticInner.Inner;

/**
 * 内部类:静态的内部类
 * 
 * @author Mountain
 * 
 */
public class StaticInnerTest {
	public static void main(String[] args) {
		// 创建内部类的对象
		// 外部类.内部类 对象名=new 外部类.内部类();静态内部类
		StaticInner.Inner inner = new StaticInner.Inner();
		// 直接调用方法
		inner.test();
		// 第二种方式
		Inner i = new Inner();
		i.test();

	}
}

/**
 * 类:这个类中包含了一个类,并且是一个静态的内部类
 * 
 * @author Mountain
 * 
 */
class StaticInner {
	// 在静态的内部类中，只能调用外部类的静态方法和属性
	private static int a = 0;

	public static void t() {
		System.out.println("a");
	}
	// 在一个类中创建一个新的类
	// 只能在内部类中写静态的类
	public static class Inner {
		// 这是一个测试方法
		public void test() {
			System.out.println("我是test（）方法");
			System.out.println(a);
			t();
		}
	}
}
