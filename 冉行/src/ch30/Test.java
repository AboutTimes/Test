package ch30;


public class Test {
	public static void main(String[] args) {
		// 创建对象
		Simple si = new Simple();
		// 创建线程类
		Add add = new Add(si);
		Sub sub = new Sub(si);
		Add add1 = new Add(si);
		Sub sub1 = new Sub(si);
		add.start();
		sub.start();
		add1.start();
		sub1.start();
	}
}
