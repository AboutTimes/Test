package com.oracle.ch29;
//线程的使用继承的方式Thread
//重写父类的方法 run
public class Test extends Thread {
	@Override
	public void run() {
		System.out.println("测试");
		try {
			//2秒后在执行后边的代码
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("测试");
	}

	public static void main(String[] args) {
		Test t=new Test();
		//启动线线程:线程只能使用start
		t.start();
		//返回线程的名称
		String str=t.getName();
		System.out.println(str);
	}
}
