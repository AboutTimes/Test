package com.oracle.ch20;

/**
 * 异常的操作
 * 
 * @author Administrator
 * 
 */
public class ExceptionTest {
	public static void main(String[] args) {
		// 如果是double类型输出的结果就是Infinity <数>无穷大; 无限的时间或空间;
		int i = 1;
		int j = 0;
		// 把会出现异常的地方使用try给包起来
		// 第二步使用catch()
		int result = 0;
		try {
			result = i / j;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(result);

	}
}
