package com.oracle.ch9;

public class D extends C {

	public D(A a) {
		super(a);
		// TODO Auto-generated constructor stub
	}
	public void b(){
		System.out.println("���ǹ���D");
	}
	public void a(){
		super.a();
		this.b();
	}
}
