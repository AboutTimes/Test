package com.cracle.ch10;

public class Rh1 extends Thread{
		public void run(){
			System.out.println("��������");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					System.out.print(j);
					System.out.print("*");
					System.out.print(i);
					System.out.print("=");
					System.out.print(j*i);
					System.out.print("\t");
				}
			
			System.out.println();
				
			}
		}
		public static void main(String[] args) {
			Rh1 r=new Rh1();
			r.start();
			String str=r.getName();
			System.out.println(r.getName());
			
		}
}
