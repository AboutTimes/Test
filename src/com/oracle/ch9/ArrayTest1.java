package com.oracle.ch9;

public class ArrayTest1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 定义一个字符串的数组
		String array[] = new String[5];
		// 数组的长度
		System.out.println(array.length);
		// 通过for赋值
		for (int i = 0; i < array.length; i++) {
			array[i] = "测试没有通过人员" + (i + 1);
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
