package ch29;

public class Test1 extends Thread {
	public Test1() {
	}

	/**
	 * 给我们的线程取上一个新的名字
	 * 
	 * @param name
	 */
	public Test1(String name) {
		// 调用父类的构造方法：super(可以写上参数);
		super(name);
	}

	public static void main(String[] args) {
		Test1 t = new Test1("我们村小黄不见吧");
		// /得到当前线程的名字
		System.out.println("当前线程的名字" + t.getName());
	}
}
