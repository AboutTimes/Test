package com.oracle.ch7;

/**
 * ������
 * 
 * @author Moutian
 * 
 */
public class Animal {
	private String name;
	// ����:����������ֱ��д�ϻ�����
	// 1.��ִ������
	// 2.��ִ�й��췽��
	{
		// ������Ǻܶ�ĳ�ʼ�����������ߴ�������
		System.out.println("��������");
	}
	// ��̬����
	static {
		System.out.println("���Ǿ�̬������");
	}

	// ���췽��
	public Animal() {
		System.out.println("����Animal�е���ʽ���췽�� ");
	}

	/**
	 * ��һ�������Ĺ��췽��
	 * 
	 * @param name
	 */
	public Animal(String name) {
		this.name = name;
	}

	/**
	 * �����
	 */
	@Override
	public String toString() {
		return this.name;
	}
}
