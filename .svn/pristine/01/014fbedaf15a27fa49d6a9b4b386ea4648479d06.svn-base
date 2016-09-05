package com.oracle.ch20;

public class ExceptionTest1 {
	public static void main(String[] args) {
		/*异常:语法：try{可能会出现异常的地方}catch(捕获异常)
		 * {处理异常,也可以输出详细的信息}finally{这是与我们之前的switch最后一个default一样的效果}
		 * 不管你以上是否正常处理，他都会执行
		*/
		try {
			//可以会出异常的地方
			System.out.println(1/0);
		}catch(ArithmeticException e){
			System.out.println("我是ArithmeticException");
		} 
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("不以除以0");
			//原因是我们没有输出这句话：输出详细的异常信息
			
			//catch处理异常
			//finally可以不用写:可以退出程序，关闭IO流...
		}
		
		finally{
			System.out.println("程序结束");
		}
	}
}
