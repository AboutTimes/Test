package com.oracle.ch11;

public class Test {
	public static void main(String[] args) {
		// 1. ����ʵ��
		Test test = new Test();
		Test test2 = new Test();
		// �Ƚ϶��������Ƿ����,���ǵ����õ�ַ�ǲ�һ����
		System.out.println(test == test2);
		test2 = test;
		System.out.println(test==test2);
		//���󣺷ֱ𴴽���������������ʹ��==��Ľ��Ϊtrue
		
	}
}
