package com.oracle.ch9;

public class E extends C {

	public E(A a) {
		super(a);
		
		// TODO Auto-generated constructor stub
	}
		public void b(){
			System.out.println("我是功能E");
		}
		public void a(){
			super.a();
			this.b();
		}
}
