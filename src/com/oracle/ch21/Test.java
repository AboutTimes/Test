package com.oracle.ch21;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * 局部内部类:在方法中定义类
 * 
 * @author Administrator
 * 
 */
public class Test {
	public static void main(String[] args) {
		Inner inner=new Inner();
		inner.t();
		
	}
}

class Inner {
	// 定义一个方法
	public void t() {
		// 在方法中定义类：叫做局部的内部类
		class T1 {
			// 局部的内部类中包含一个方法
			public String tt() {
				return "ABC";
			}
		}
		//接收返回值
		T1 t=new T1();
		String str=t.tt();
		System.out.println(str);

	}
}




