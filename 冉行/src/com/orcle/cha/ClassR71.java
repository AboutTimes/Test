package com.orcle.cha;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;


public class ClassR71 {
			public static void main(String[] args) throws ClassNotFoundException {
				Class<?> c=Class.forName("java.util.ArrayList");
				System.out.println("��ı�׼���ƣ�"+c.getCanonicalName());
				System.out.println("������η���"+Modifier.toString(c.getModifiers()));
				
				TypeVariable<?> []typeVariables=c.getTypeParameters();
				System.out.println("��ķ��Ͳ�����");
				if(typeVariables.length!=0){
					for(TypeVariable<?>typeVarible:typeVariables){
						String typeVariable = null;
						System.out.println(typeVariable+"\t");	
					}
				}else{
					System.out.println("��");
				}
			}
}
