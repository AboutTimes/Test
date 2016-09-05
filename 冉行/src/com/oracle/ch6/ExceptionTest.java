package com.oracle.ch6;

public class ExceptionTest {
			public static void main(String[] args) {
					int a=1;
					int b=0;
					int result;
					result=a/b;
					try{
						System.out.println(result);
					}catch(Exception e){
						e.printStackTrace();
					}
					System.out.println(result);
			}
			  		
			}

