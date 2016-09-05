package ch30.ch30.test;

/**
 * 二个线程，一个加1一个减1
 * 
 * @author Mountain
 * 
 */
public class Sample {
	private int number;

	/**
	 * 加一
	 */
	public synchronized void increase() {
		// 将if改为while
		while (0 != number) {
			try {
				// 等待别一个线程
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number++;
		System.out.println("increase" + number);
		// 通知另一线程
		notify();
	}

	public synchronized void decrease() {
		// 将if改为while
		while (0 == number) {
			// 等待别一个线程
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		number--;
		System.out.println("decrease" + number);
		// 通知另一线程
		notify();

	}
}
