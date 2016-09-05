package com.oracle.ch7;

public class De {
	public static int compute1(int num) {
		System.out.println(num);
		// 定义一个变量用于计算
		int result = num;
		// 方法必须要有出口,也就是退出该方法
		// 判断当我们传入进来的num=1时，我们就退出该方法
		if (num == 1) {
			return 1;
		}
		return result + compute1(num - 1);
	}
	public static void main(String[] args) {
		int ruselt=compute1(5);
		System.out.println(ruselt);
	}
}
