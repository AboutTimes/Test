package ch20;

public class MyExceptionTest {
	public static void method() throws MyException {
		System.out.println("我是一个方法");
		// 抛出异常
		throw new MyException("明天后就可以休息");
	}

	public static void main(String[] args) {
		try {
			// 当我们执行到这里时，系统会自动的为我们创建一个对象[我们对应的异常]
			method();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			
			if (1 > 2) {
				throw new MyException("1>2");
			} else if (1 < 1) {
				throw new MyException("1<2");
			} else {
				throw new Exception("条件都不成立");
			}
			//只要出现一个异常后，后边的异常就不会在执行
			
			// 在我们出现异常时都会去创建一个对象
		} catch (MyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
