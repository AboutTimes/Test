package com.cracle.ch10;

public class Hd {
		private static Hd d=null;
		private Hd(){}
		public static Hd a(){
			if(d==null){
				d=new Hd();
			}
			return d;
		}
		public void b(){
			System.out.println("���Ƿ�ѩ������ϲ����Ů��");
		}
		public static void main(String[] args) {
			System.out.println("������Ů");
			Hd t1=Hd.a();
			t1.b();
			System.out.println("ͯ�վ���");
			Hd t2=Hd.a();
			t2.b();
			System.out.println("�Ը��ջ�");
			Hd t3=Hd.a();
			t3.b();
		}
}
