package com.orcle.cha;

public class R48 {
		public void keke(){		//����û�в����ķ���
			System.out.println("��ͨ���������տƼ�1���ˣ�");
		}
		public void keke(int age){		//����������Ͳ����ķ���
			System.out.println("���տƼ�"+age+"���ˣ�");
		
		}
		public static void main(String[] args) {
			R48 tr=new R48();		//��������
			tr.keke();				//���÷���
			for(int i=1;i<5;i++){
				tr.keke(i);
			}
		}
}
