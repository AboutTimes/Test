package com.cracle.ch10;

public class Jy extends Thread {
			public void run(){
				System.out.println("��ĺ�ϲ����ѽ��");
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
				System.out.println("��Ҫ�뿪�Һ��");
				
			}
			public static void main(String[] args) {
				Jy jy=new Jy();
				jy.start();
				String str=jy.getName();
				System.out.println(str);
			}
			
}
