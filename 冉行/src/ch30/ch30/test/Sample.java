package ch30.ch30.test;

/**
 * �����̣߳�һ����1һ����1
 * 
 * @author Mountain
 * 
 */
public class Sample {
	private int number;

	/**
	 * ��һ
	 */
	public synchronized void increase() {
		// ��if��Ϊwhile
		while (0 != number) {
			try {
				// �ȴ���һ���߳�
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;
		System.out.println("increase" + number);
		// ֪ͨ��һ�߳�
		notify();
	}

	public synchronized void decrease() {
		// ��if��Ϊwhile
		while (0 == number) {
			// �ȴ���һ���߳�
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number--;
		System.out.println("decrease" + number);
		// ֪ͨ��һ�߳�
		notify();

	}
}
