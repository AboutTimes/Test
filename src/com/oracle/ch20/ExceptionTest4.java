package com.oracle.ch20;

public class ExceptionTest4 {
	// �Լ�����һ�������׳��쳣
	public static void method() throws Exception {
		System.out.println("������ִ��");
		// �׳��쳣 throw new һ����ϸ���쳣
		throw new Exception("���Է��ĵ��ˣ���ȥ�Է�");
	}
	//��������ļ��ʱ�쳣
	public static void main(String[] args) {
		//��̬�ķ�������ֱ�ӵ��þ�̬�ķ���
		//�Ǿ�̬�ķ�������ֱ�ӵ��þ�̬�ķ���
		//��̬�ķ������ܵ���ֱ�ӷǾ�̬�ķ���
		try {
			method();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			//�����ϸ���쳣��Ϣ
			e.printStackTrace();
		}
	}
}




