package com.oracle.ch6;

public class InstanceofTest {
	public static void main(String[] args) {
		B b = new B();
		// �ж�ĳ�������Ƿ���ĳ�����ʵ��
		System.out.println(b instanceof A);
		System.out.println(b instanceof B);

	}

}

class A {

}

class B extends A {

}
