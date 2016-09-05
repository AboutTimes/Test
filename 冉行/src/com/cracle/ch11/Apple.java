package com.cracle.ch11;

public class Apple {
	private int c1=9;
	public synchronized void apple(){
		
		if(c1==0){
			System.out.println(Thread.currentThread().getName()+"这个小家伙没有抢到苹果,哭兮咧了的！好焦人哦。");
			
		}else{
			System.out.println(Thread.currentThread().getName()+"好高兴啊！我抢到了苹果");
			c1--;
		}
	}	
		public static void main(String[] args) {
			Apple al=new Apple();
			Ch c1=new Ch(al);
			c1.setName("朱定杰");
			c1.start();
			Ch c2=new Ch(al);
			c2.setName("冉行");
			c2.start();			
			Ch c3=new Ch(al);
			c3.setName("方雪");
			c3.start();
			Ch c4=new Ch(al);
			c4.setName("马忠泽");
			c4.start();
			Ch c5=new Ch(al);
			c5.setName("晏钰杰");
			c5.start();
			Ch c6=new Ch(al);
			c6.setName("曾建波");
			c6.start();
			Ch c7=new Ch(al);
			c7.setName("唐祥浩");
			c7.start();
			Ch c8=new Ch(al);
			c8.setName("黄军霞");
			c8.start();
			Ch c9=new Ch(al);
			c9.setName("龚元福");
			c9.start();
			Ch c10=new Ch(al);
			c10.setName("胡登前");
			c10.start();
			
		}
	
		
	}

class Ch extends Thread{
	private Apple ae;
	public Ch(Apple ae){
		this.ae=ae;
	}
	@Override
	public void run() {
		try {
			Thread.sleep((long)Math.random()*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ae.apple();
	}
}
