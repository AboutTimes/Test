package ch29;

/**
 * 线程的使用
 * 
 * @author Administrator
 * 
 */
public class ThreadTest1 {
	public static void main(String[] args) {
		Thread1 t = new Thread1();
		Thread2 t1 = new Thread2();
		t.start();
		t1.start();
	}
}

class Thread1 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("hell world" + i);
		}
	}
}

class Thread2 extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println("world" + i);
		}
	}
}
