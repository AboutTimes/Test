package com.oracle.ch7;

public class De {
	public static int compute1(int num) {
		System.out.println(num);
		// ����һ���������ڼ���
		int result = num;
		// ��������Ҫ�г���,Ҳ�����˳��÷���
		// �жϵ����Ǵ��������num=1ʱ�����Ǿ��˳��÷���
		if (num == 1) {
			return 1;
		}
		return result + compute1(num - 1);
	}
	public static void main(String[] args) {
		int ruselt=compute1(5);
		System.out.println(ruselt);
	}
}
