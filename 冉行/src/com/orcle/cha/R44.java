package com.orcle.cha;
import java.util.Scanner;//���
public class R44 {
	public double getFar(double c){
		double far=1.8*c+32; //����double������
	
		return far;   //���ص�ֵ
		
	}
	public static void main(String[] args) {
		System.out.println("������Ҫת�����¶ȣ�����λ���϶ȣ�");  
		 Scanner in=new Scanner(System.in);//�����¶���
		  double c=in.nextDouble(); //����ֵ
		  R44 r=new R44(); //�����¶���
		  double far=r.getFar(c); // ���ö����뷽��
		  System.out.println("ת����ɵ��¶ȣ�"+far);
		  
	}
}
