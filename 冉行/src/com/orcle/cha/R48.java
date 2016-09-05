package com.orcle.cha;

public class R48 {
		public void keke(){		//定义没有参数的方法
			System.out.println("普通方法：明日科技1岁了！");
		}
		public void keke(int age){		//定义包含整型参数的方法
			System.out.println("明日科技"+age+"岁了！");
		
		}
		public static void main(String[] args) {
			R48 tr=new R48();		//创建对象
			tr.keke();				//调用方法
			for(int i=1;i<5;i++){
				tr.keke(i);
			}
		}
}
