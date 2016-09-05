package test.src.com.oracle.ch1;

public class QQ extends Car {
	// 如果父类中没有带参数的构造方法，我们在子类中不能重写出来
	public QQ() {
		super();
		// 调用父类中的属性使用super.属性
		// 调用父类中的方法使用super.方法();
	}

	// 可不可以在子类中添加新的构造方法
	// 注意事项：父类中有的构造方法，子类中就必须要有
	public QQ(String name) {
		this.name = name;
	}

	/**
	 * 写那带参数的构造方法 ，我们隐式的构造方法需要重写
	 * 
	 * @param name
	 * @param color
	 */
	public QQ(String name, String color) {
		super(name, color);
	}

	// 他就有我们Car汽车的属性和方法私有的，final,static
	@Override
	public void driver() {
		super.driver();
		super.name="小本";
	}
}
