package com.orcle.cha;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;


public class ClassR71 {
			public static void main(String[] args) throws ClassNotFoundException {
				Class<?> c=Class.forName("java.util.ArrayList");
				System.out.println("类的标准名称："+c.getCanonicalName());
				System.out.println("类的修饰符："+Modifier.toString(c.getModifiers()));
				
				TypeVariable<?> []typeVariables=c.getTypeParameters();
				System.out.println("类的泛型参数：");
				if(typeVariables.length!=0){
					for(TypeVariable<?>typeVarible:typeVariables){
						String typeVariable = null;
						System.out.println(typeVariable+"\t");	
					}
				}else{
					System.out.println("空");
				}
			}
}
