package com.oracle.ch11;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		//����һ������
		ArrayList array=new ArrayList();
		array.add(44);
		array.add("�й�");
		//�õ�������ʵ�Ĵ�С
		System.out.println(array.size());
		//�ж�Ԫ���Ƿ�Ϊ��
		System.out.println(array.isEmpty());
		//ȡ��ArrayList�е�Ԫ��
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		//�򼯺���������Ϣʱ����Ҫ������ͬ������
		//���й�������ת��Ϊint
		//int i= (int) array.get(1);
		
		
	}
}