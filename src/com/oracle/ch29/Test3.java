package com.oracle.ch29;

public class Test3 extends Thread {
	@Override
	public void run() {
		int i = 0;
		while (true) {
			i++;
			System.out.println(i);
			// �����߳�
			if (i == 100) {
				return;
			}
		}
	}

	public static void main(String[] args) {
		Test3 t = new Test3();
		t.start();
		// ��Ҫʹ�ø÷�ʽֹͣ�߳�
		// t.stop();
	}
}
