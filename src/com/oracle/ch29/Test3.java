package com.oracle.ch29;

public class Test3 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (true) {
			i++;
			System.out.println(i);
			// 结束线程
			if (i == 100) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.start();
		// 不要使用该方式停止线程
		// t.stop();
	}
}
