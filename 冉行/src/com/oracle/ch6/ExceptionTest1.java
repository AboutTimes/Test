package com.oracle.ch6;

public class ExceptionTest1 {
			public static void main(String[] args) {
				try{
					System.out.println(1/0);
					}
				catch(ArithmeticException e){
					
					System.out.println("���Ƿ�ѩ������Ҵ�磡");
					}
				catch(Exception e){
					e.printStackTrace();
					System.out.println("������0��Ϊ������");
				}
				finally{
				System.out.println("�����춨�ܣ�����Ҵ��磡");
				}
			}
}
