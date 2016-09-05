package com.oracle.ch30;

import java.util.Random;

/**
 * 线程的使用
 * 
 * @author Mountain
 * 
 */
public class ThreadTest {
	public static void main(String[] args) {
		ThreadT t = new ThreadT();
		t.start();
		ThreadT t1 = new ThreadT();
		t1.start();

	}
}

/**
 * 线程中对于成员变量和局部变量的使用
 * 
 * @author Mountain
 * 
 */
class ThreadT extends Thread {

	// 定义一个成员变量:当成员变量的值等于50时退出我们的线程
	//int i = 0;

	@Override
	public void run() {
		int i=0;
		// 通过死循环来控制线程的使用
		while (true) {
			System.out.println("number" + i++);
			try {
				Thread.sleep((long)Math.random() * 1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 当i的值等于50时退出
			if (i == 50) {
				return;
			}
		}

	}
}
