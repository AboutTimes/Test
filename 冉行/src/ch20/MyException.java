package ch20;

/**
 * 自定义异常:我们需要继承自Exception
 * 
 * @author Administrator
 * 
 */
public class MyException extends Exception {
	public MyException() {

	}

	// 重写一个构造方法，传入参数
	public MyException(String message) {
		// 把参数传给我们的父类
		super(message);
	}
	
	
}
