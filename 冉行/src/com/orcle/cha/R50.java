package com.orcle.cha;

import java.util.Random;

public class R50 {
				private static int counter=0;	//����һ��������
				public R50(String title){
					System.out.println("�۳�ͼ��"+title); 		//�������
					counter++;							//������+1
					
				}
				public static int getCounter(){
					return counter;					//��ý��
				}
				public static void main(String[] args) {
					//������������
					String[]titles={
							"��java�����ŵ���ͨ����2�棩��","��java��̴ǵ䡷","����Ƶѧjava��"
					};
					for(int i=0;i<5;i++){
						new R50(titles[new Random().nextInt(3)]);	//�����������鴴��Book��R50������
					}
					System.out.println("�ܼ�������"+R50.getCounter()+"��ͼ�飡");//�����������ĸ���
				}
}
