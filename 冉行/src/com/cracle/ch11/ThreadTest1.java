package com.cracle.ch11;

public class ThreadTest1 {
		public static void main(String[] args) {
			Ex ex=new Ex();
			T t=new T(ex);
			t.start();
			R r=new R(ex);
			r.start();
		}
}
class Ex{
	public synchronized void t(){
		for(int i=0;i<50;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("t"+i);
		}
	}
	public synchronized void r(){
		for(int i=0;i<50;i++){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("r"+i);
		}
	}
}
class T extends Thread{
	Ex ex;
	public T(Ex ex){
		this.ex=ex;
	}
	@Override
	public void run() {
		this.ex.t();
	}
}
class R extends Thread{
	Ex ex;
	public R(Ex ex){
		this.ex=ex;
		
	}
	@Override
	public void run() {
		this.ex.r();
	}
}









