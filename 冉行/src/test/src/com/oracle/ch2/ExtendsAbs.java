package test.src.com.oracle.ch2;

//子类中可以使用继承的方式去操作我们的抽象类
public class ExtendsAbs extends AbstractTest {
	// 继承自抽象类后，我们必须实现抽象类中的方法
	@Override
	public void t() {
		System.out.println("我在子类中实现了抽象类的方法");
	}

}
