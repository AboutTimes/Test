package com.oracle.ch25;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char c='a';
		//a��Ӧ��ASCII 97 z ��Ӧ�� ����ֵ��25
		//����Ѵ�д��Aת��Сд��a ���ֵ��32
		char c1='z';
		int i=c;
		int ii=c1;
		System.out.println(i);
		System.out.println(ii);
		
		char a='A';
		//��Сд��ĸת�ɴ�д��ĸ-32
		int ia=a+32;
		System.out.println((char)ia);
		
		System.out.println((char)94);
	}

}
