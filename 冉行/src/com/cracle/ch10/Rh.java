package com.cracle.ch10;

public class Rh {
	public static void main(String[] args) {
		R1 r=new R1();
		R2 r2=new R2();
		Thread t=new Thread(r);
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
		System.out.println(t.getName());
		System.out.println(t2.getName());
	}	
}
	class R1 implements Runnable{
		public void run(){
			System.out.println("我是R1线程。");
		}
	}
	class R2 implements Runnable{
		public void run(){
			System.out.println("我是R2线程。");
		}
	}

