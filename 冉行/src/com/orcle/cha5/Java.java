package com.orcle.cha5;

import java.util.Scanner;

public class Java{
		
			public static void main(String[] args) {
				String name;
				String yuj;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("=====��ӭ������ҵ�ύϵͳ==========");
				
				System.out.println("�����������ҵ����");
			
				 name=sc.next();
				System.out.println("�����������ַ��");
				 yuj=sc.next();
				
			
			int i=name.indexOf(".");
			int s=yuj.indexOf("@");
			if(i!=-1 && i!=0 && name.substring(i+1,name.length()).equals("java")){
				System.out.println("");
				
			}else{
				System.out.println("�ļ�����Ч");
			}
			if(yuj.indexOf("@")!=-1  && yuj.indexOf('.') > yuj.indexOf('@')){
					System.out.println("");
			}else{
				System.out.println("������Ч");
			}
}
}
