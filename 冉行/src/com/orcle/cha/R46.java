package com.orcle.cha;

public class R46 {
			private static R46 r46=null;// ����һ��r46�������
			private R46(){}				//�����췽��˽��
			public static R46 getInstance(){	//ʵ��������
				if(r46==null){
					r46=new R46();
				}
				return r46;
				
			}
			public void getName(){				//ʹ����ͨ��������ʵ�����
				System.out.println("���ǻʵۣ������");
				System.out.println("�������ǰ���");
			}
}
