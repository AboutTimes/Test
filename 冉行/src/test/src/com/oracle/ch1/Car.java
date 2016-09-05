package test.src.com.oracle.ch1;

/**
 * 汽车类：主要作用包含：二个属性和一个方法
 * 
 * @author Mountain 我们所有的类都直接或者间接的继承自那个类Object
 * 
 */
public class Car {
	// 属性汽车的名字
	String name;
	String color;

	/**
	 * 驾驶汽车的方法
	 */
	public void driver() {
		System.out.println("小李开动汽车了");
	}

	/**
	 * 带参数的构造方法
	 * 
	 * @param name
	 *            汽车的名字
	 * @param color
	 *            汽车的颜色
	 */
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Car(){
		
	}
}
