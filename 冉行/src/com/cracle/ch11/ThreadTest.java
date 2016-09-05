package com.cracle.ch11;
/**
 * 线程的使用
 * @author Mountain
 *
 */
public class ThreadTest {
		public static void main(String[] args) {
			ThreadT t=new ThreadT();
			t.start();
			ThreadT t1=new ThreadT();
			t1.start();
		}
}
class ThreadT extends Thread {
	
	public void run(){
		int i=0;
		while(true){
			System.out.println("number"+i++);
			try {
				Thread.sleep((long)Math.random()*1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if(i==50){
				return;
			}
		}
	}
}
