package ch29;

public class Singleton {
	// 1.单例模式
	//在多线程下实现单例模式
	private static Singleton sing=new Singleton();
	private Singleton() {

	}
	public static Singleton get() {
		/*多线程中不能使用这种写法
		if (sing == null) {
			sing = new Singleton();
		}*/
		return sing;
	}

	public void s() {
		System.out.println("测试方法");
	}
}
