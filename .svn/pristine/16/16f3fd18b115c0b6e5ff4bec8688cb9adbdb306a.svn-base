package com.oracle.ch23;

public class Fab {
	// 斐波那契数列
	public int compute(int num) {
		System.out.println(num);
		// 出口方法
		if (num == 1 || num == 2) {
			return 1;
		}
		// compute(num - 1)这是第一个值
		// compute(num - 2)这是第二个值
		return compute(num - 1) + compute(num - 2);
	}

	public static void main(String[] args) {
		Fab b = new Fab();
		int i=b.compute(5);
		
		//System.out.println(i);
	}
}
