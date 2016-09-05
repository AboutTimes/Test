package com.oracle.ch9;

/**
 * 数组
 * 
 * @author mountain
 * 
 */
public class ArrayTest {
	public static void main(String[] args) {
		// 数组就是存放一组相同的数据类型
		// 8种原始数据类型，引用类型都可以是数组
		// 1数组的定义 类型【原始数据类型或者引用类型】
		// [] 数组名=｛｝;直接赋值
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		// 以上的定义方式：表示数组的长度为8也就是可以存放8个int类型
		//先定义，一定要写上数组的长度
		int[] array1=new int[8];
		//给数组赋值
		//在数组中，第一个元素是以0开始的
		array1[0]=123;
		array1[7]=8;
		//输出元素的信息
		System.out.println(array1[7]);
		
		
		
		
		

	}
}
