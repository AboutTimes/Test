package com.oracle.ch20;

public class ExceptionTest4 {
	// 自己定义一个方法抛出异常
	public static void method() throws Exception {
		System.out.println("方法被执行");
		// 抛出异常 throw new 一个详细的异常
		throw new Exception("到吃饭的点了，该去吃饭");
	}
	//处理这里的检查时异常
	public static void main(String[] args) {
		//静态的方法可以直接调用静态的方法
		//非静态的方法不能直接调用静态的方法
		//静态的方法不能调用直接非静态的方法
		try {
			method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//输出详细的异常信息
			e.printStackTrace();
		}
	}
}




