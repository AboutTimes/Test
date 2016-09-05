package com.cracle.ch10;

public class Jy extends Thread {
			public void run(){
				System.out.println("真的很喜欢你呀。");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("不要离开我好嘛？");
				
			}
			public static void main(String[] args) {
				Jy jy=new Jy();
				jy.start();
				String str=jy.getName();
				System.out.println(str);
			}
			
}
