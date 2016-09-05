package com.oracle.ch6;

public class ExceptionTest1 {
			public static void main(String[] args) {
				try{
					System.out.println(1/0);
					}
				catch(ArithmeticException e){
					
					System.out.println("我是方雪，请叫我大哥！");
					}
				catch(Exception e){
					e.printStackTrace();
					System.out.println("不能以0作为被除数");
				}
				finally{
				System.out.println("我是朱定杰，请叫我大表哥！");
				}
			}
}
