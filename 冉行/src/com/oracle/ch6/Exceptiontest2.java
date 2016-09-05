package com.oracle.ch6;

import ch20.MyException;

public class Exceptiontest2 {
		public static void method() throws Exception {
			System.out.println("我是一个方雪！");
			throw new Exception("我今年5岁了");
		}
		public static void main (String []args){
			try {
				method();
			} catch (Exception e) {
				
				e.printStackTrace();
			}

			try{if (1 > 2) {
				throw new MyException("1>2");
			} else if (1 < 1) {
				throw new MyException("1<2");
			} else {
				throw new Exception("条件都不成立");
			}
			}catch(Exception e){
				e.printStackTrace();
			}
		}
}
