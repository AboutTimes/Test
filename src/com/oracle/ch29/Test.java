package com.oracle.ch29;
//�̵߳�ʹ�ü̳еķ�ʽThread
//��д����ķ��� run
public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("����");
		try {
			//2�����ִ�к�ߵĴ���
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����");
	}

	public static void main(String[] args) {
		Test t=new Test();
		//�������߳�:�߳�ֻ��ʹ��start
		t.start();
		//�����̵߳�����
		String str=t.getName();
		System.out.println(str);
	}
}
