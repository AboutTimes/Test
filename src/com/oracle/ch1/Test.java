package com.oracle.ch1;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ��������
		QQ qq = new QQ();
		// ���ö����е����Ժͷ���
		qq.name = "С����";
		System.out.println(qq.name);
		// ���������еķ���
		qq.driver();
		// ��̬����������ÿ���ָ�����������
		Car car = new QQ();
		// ת��
		QQ q = (QQ) car;
	}

}
