package test.src.com.oracle.ch2;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// 通过抽象类创建对象目前的方式，使用多态来创建
		AbstractTest test = new ExtendsAbs();
		test.name = "小小";
		// 调用 show方法
		test.show();
		// 调用t()方法
		test.t();
		/*
		 * 6. 无论何种情况，只要一个类是抽象类，
		 * 那么这个类就无法实例化。
		 * ，我们只能通过多态的方式去创建对象{也叫实例化}
		 */
	}

}
