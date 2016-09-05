package com.cracle.ch10;

public class Fuck {
	public static void main(String[] args) {
		Abc e=new Abc();
		Thread th=new Thread(e);
		th.start();
		System.out.println(th.getName());
		
	}
}
class Abc implements Runnable{
		public void run(){
			System.out.println("µÂÂêÎ÷ÑÇ");
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
	}

