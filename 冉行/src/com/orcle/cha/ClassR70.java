package com.orcle.cha;

import java.util.Date;



public class ClassR70 {
			public static void main(String[] args) throws ClassNotFoundException {
				System.out.println("��һ�ַ�����Object��getR70()");
				Class c1=new Date().getClass();
				System.out.println(c1.getName());
				System.out.println("�ڶ��ַ�������class�﷨");
				Class c2=boolean.class;
				System.out.println(c2.getName());
				System.out.println("�����ַ�����Class.forName()");
				Class c3=Class.forName("java.lang.String");
				System.out.println(c3.getName());
				System.out.println("�����ַ�������װ���TYPE��");
				Class c4=Double.TYPE;
				System.out.println(c4.getName());
				
			}
}
