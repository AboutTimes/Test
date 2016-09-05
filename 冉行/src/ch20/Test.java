package ch20;

public class Test {
	public static void method() {
		
		try {
			System.out.println("try语句被执行");
			//return;try语句会执行finally会执行，后边的代码不会执行
			//退出java虚拟机,退出整个应用程序
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch被执行");
		} finally {
			System.out.println("finally被执行");
		}
		System.out.println("方法被执行");
	}

	public static void main(String[] args) {
		method();
	}
}
