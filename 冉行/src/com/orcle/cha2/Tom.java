package com.orcle.cha2;

import java.util.Scanner;

public class Tom {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			String yh;
			String mm;
			System.out.println("�������û�����");
			yh=sc.next();
			System.out.println("���������룺");
			mm=sc.next();
			if(mm.length()>=6){
				System.out.println("ע��ɹ�");
			}else{
				System.out.println("���볤�ȱ������6λ");
			}
		}
}
