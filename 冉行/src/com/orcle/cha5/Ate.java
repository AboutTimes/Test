package com.orcle.cha5;

public class Ate {
			public static void main(String[] args) {
				String geci="��ͤ��   �ŵ���  ���ݱ�����  ����  ��������  Ϧ��ɽ��ɽ";
				String []shbi=new String[100];
				System.out.println("****ԭ��ʸ�ʽ*****\n"+geci);
				System.out.println("\n****��ֺ���****");
				shbi=geci.split("  ");
				for (int i = 0; i < shbi.length; i++) {
					System.out.println(shbi[i]);
				}
			}
}
