package com.cracle.ch11;

public class Apple {
	private int c1=9;
	public synchronized void apple(){
		
		if(c1==0){
			System.out.println(Thread.currentThread().getName()+"���С�һ�û������ƻ��,�������˵ģ��ý���Ŷ��");
			
		}else{
			System.out.println(Thread.currentThread().getName()+"�ø��˰�����������ƻ��");
			c1--;
		}
	}	
		public static void main(String[] args) {
			Apple al=new Apple();
			Ch c1=new Ch(al);
			c1.setName("�춨��");
			c1.start();
			Ch c2=new Ch(al);
			c2.setName("Ƚ��");
			c2.start();			
			Ch c3=new Ch(al);
			c3.setName("��ѩ");
			c3.start();
			Ch c4=new Ch(al);
			c4.setName("������");
			c4.start();
			Ch c5=new Ch(al);
			c5.setName("���ڽ�");
			c5.start();
			Ch c6=new Ch(al);
			c6.setName("������");
			c6.start();
			Ch c7=new Ch(al);
			c7.setName("�����");
			c7.start();
			Ch c8=new Ch(al);
			c8.setName("�ƾ�ϼ");
			c8.start();
			Ch c9=new Ch(al);
			c9.setName("��Ԫ��");
			c9.start();
			Ch c10=new Ch(al);
			c10.setName("����ǰ");
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
