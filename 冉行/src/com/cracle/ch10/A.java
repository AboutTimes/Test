package com.cracle.ch10;

public class A extends Thread {
		public static void main(String[] args) {
			A a=new A();
			
			a.start();
			String str=a.getName();
			System.out.println(a.getName());
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Thread1 t=new Thread1();
			Thread r=new Thread(t);
			r.start();	
			System.out.println(r.getName());
					
		}
		public void run(){
			System.out.println("德玛西亚");
			
			for(int i=1;i<=9;i++){
				for(int j=1;j<=i;j++){
					System.out.print(i+"*"+j+"="+i*j+"\t");
				}
				System.out.println();
			}
		}
}
class Thread1 implements Runnable{
	public void run(){
		System.out.println("德玛西亚大哥大");
		
		for(int i=1;i<=9;i++){
			for(int j=1;j<=i;j++){
				System.out.print(i+"*"+j+"="+i*j+"\t");
			}
			System.out.println();
		}
	}
	}
