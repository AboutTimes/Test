package ch29;

public class SingTest extends Thread {
	public static void main(String[] args) {
		// 创建线程
		SingTest s = new SingTest();
		SingTest s1 = new SingTest();
		s.start();
		s1.start();
	}

	@Override
	public void run() {
		// 得到单例对象
		Singleton s = Singleton.get();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Singleton s1 = Singleton.get();
		System.out.println(s == s1);
	}
}
