 package com.oracle.ch3;

public class E implements IA, IB {

	@Override
	public void b() {
		System.out.println("b");

	}

	@Override
	public void a() {
		System.out.println("a");

	}
	public static void main(String[] args) {
		//��̬������
		IA a=new E();
		a.a();
		E e=new E();
		e.a();
		e.b();
	}

}
