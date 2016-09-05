package com.cracle.ch11;

public class ThreadTest2 {
	public static void main(String[] args) {
		Aimple aimple = new Aimple();
		TheThread1 t1 = new TheThread1(aimple);
		TheThread2 t2 = new TheThread2(aimple);
		t1.start();
		t2.start();
	}
}

class Aimple {
	private Object object = new Object();

	public void execute() {
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep((long) Math.random() * 1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("example:" + i);
			}
		}
		System.out.println("aaaaaaa");
	}

	public void execute2() {
		synchronized (this) {
			for (int i = 0; i < 50; i++) {
				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("execute:" + i);
			}
		}
	}
}

class TheThread1 extends Thread {
	private Aimple aimple;

	public TheThread1(Aimple aimple) {
		this.aimple = aimple;
	}

	@Override
	public void run() {
		this.aimple.execute();
	}
}

class TheThread2 extends Thread {
	private Aimple aimple;

	public TheThread2(Aimple aimple) {
		this.aimple = aimple;
	}

	@Override
	public void run() {
		this.aimple.execute2();
	}
}
