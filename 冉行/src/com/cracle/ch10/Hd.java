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
			System.out.println("我是方雪，我最喜欢美女。");
		}
		public static void main(String[] args) {
			System.out.println("波霸美女");
			Hd t1=Hd.a();
			t1.b();
			System.out.println("童颜巨乳");
			Hd t2=Hd.a();
			t2.b();
			System.out.println("性感烧火");
			Hd t3=Hd.a();
			t3.b();
		}
}
