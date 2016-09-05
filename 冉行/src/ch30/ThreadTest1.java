package ch30;

public class ThreadTest1 {
	public static void main(String[] args) {
		Ex ex = new Ex();
		// 1.�߳�һ
		T t = new T(ex);
		// 2.�̶߳�
		T1 t1 = new T1(ex);

		t.start();
		t1.start();
	}
}

class Ex {
	// ��������ͬ����
	public synchronized void t() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t" + i);
		}
	}

	// ��������ͬ����
	public synchronized void t1() {
		for (int i = 0; i < 50; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t1   " + i);
		}
	}
}

class T extends Thread {
	Ex ex;

	public T(Ex ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		this.ex.t();
	}
}

class T1 extends Thread {
	Ex ex;

	public T1(Ex ex) {
		this.ex = ex;
	}

	@Override
	public void run() {
		this.ex.t1();
	}
}