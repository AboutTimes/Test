package com.oracle.ch4;

/**
 * ��̬��ʹ��static,���������η������ԣ���
 * 
 * @author Administrator
 * 
 */
public class StaticTest {
	// ����static
	// ��������ʱ�����ǵ����ж���ʹ�ø�����
	static int PI;

	public static void t() {
		System.out.println("t");
	}

	public static void main(String[] args) {
		// ���ھ�̬���Ե�ʹ�ã�ֱ��ʹ������������
		StaticTest.PI = 33;
		System.out.println(StaticTest.PI);
		// ��̬�����Ժͷ�������Ҫ��������ֱ��ͨ�����������Ի��߷���
		//��̬�ķ��� ����ֱ�ӵ��þ�̬�ķ���
		//��̬�ķ����в���ֱ�ӵ��÷Ǿ�̬�ķ��� 
		t();
		StaticTest.t();
	}
}
