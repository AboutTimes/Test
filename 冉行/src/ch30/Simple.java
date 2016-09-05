package ch30;

/**
 * �߳��в�����Ա���� +1 -1�ֱ��Ƕ�����ͬ�ķ���
 * 
 * @author Administrator
 * 
 */
public class Simple {
	private int n;

	// ��1�Ĳ���
	public synchronized void add() {
		// 1.�ж�n�Ƿ����0
		// ��if��Ϊwhile
		while (n != 0) {
			try {
				// ���������߳�ִ��
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// �����ǵı�����1
		n++;
		// �����ǵ�n++ִ�������Ҫ֪ͨ�������߳�ִ��
		System.out.println(n);
		// ֪ͨ�������߳�?���ͬʱ����̵߳���ʹ��notifyAll
		notifyAll();
	}

	// �����ǵı���-1
	public synchronized void sub() {
		// ��if��Ϊwhile
		while (n == 0) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		// ִ�����ǵ��߳�,��n-1
		n--;
		System.out.println(n);
		// ֪ͨ�������̰߳�
		notifyAll();
	}
}

class Add extends Thread {
	private Simple si;

	Add(Simple si) {
		this.si = si;
	}

	// ��дrun����
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

	// ��дrun����
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
