package com.oracle.ch13;

import java.util.Random;

public class RandomTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//�����ֵ
		System.out.println(Math.abs(10));
		System.out.println(Math.ceil(10));
		System.out.println(Math.random());
		System.out.println(Math.sqrt(10));
		System.out.println(Math.PI);
		//������������������ǵ�Բ��
		//pi*r*r
		System.out.println(Math.PI*3*3);
		
		Random random =new Random();
		int i=random.nextInt(22);
		System.out.println(i);
	}

}
