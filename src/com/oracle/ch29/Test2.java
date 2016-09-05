package com.oracle.ch29;

public class Test2 {
	public static void main(String[] args) {
		R1 r1 = new R1();
		R2 r2 = new R2();
		// 需要创建一个Thread对象，接下我们把创建的R1对象放进去
		// R1是不是我们的Runnable
		Thread t = new Thread(r1);
		Thread t1 = new Thread(r2);
		//启动线程只能使用start()方法
		t.start();
		t1.start();
		System.out.println(t.getName());
		System.out.println(t1.getName());
	}
}

/**
 * 以实现接口的方式去定义线程类
 * 
 * @author
 * 
 */
class R1 implements Runnable {

	@Override
	public void run() {
		System.out.println("我是R1线程");
	}

}

class R2 implements Runnable {

	@Override
	public void run() {
		System.out.println("我是R2线程");
	}

}
