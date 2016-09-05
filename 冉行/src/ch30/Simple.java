package ch30;

/**
 * 线程中操作成员变量 +1 -1分别是二个不同的方法
 * 
 * @author Administrator
 * 
 */
public class Simple {
	private int n;

	// 加1的操作
	public synchronized void add() {
		// 1.判断n是否等于0
		// 把if改为while
		while (n != 0) {
			try {
				// 等其他的线程执行
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 让我们的变量加1
		n++;
		// 当我们的n++执行完后，需要通知其他的线程执行
		System.out.println(n);
		// 通知其他的线程?如果同时多个线程调用使用notifyAll
		notifyAll();
	}

	// 让我们的变量-1
	public synchronized void sub() {
		// 反if改为while
		while (n == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// 执行我们的线程,让n-1
		n--;
		System.out.println(n);
		// 通知其他的线程吧
		notifyAll();
	}
}

class Add extends Thread {
	private Simple si;

	Add(Simple si) {
		this.si = si;
	}

	// 重写run方法
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			si.add();
		}
	}
}

class Sub extends Thread {
	private Simple si;

	Sub(Simple si) {
		this.si = si;
	}

	// 重写run方法
	@Override
	public void run() {
		for (int i = 0; i < 20; i++) {
			try {
				Thread.sleep((long) Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			si.sub();
		}
	}
}
