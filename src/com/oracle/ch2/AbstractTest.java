package com.oracle.ch2;

/**
 * 抽象类，接口：主要用于我们程序的设计使用， 我们程序员就可以去实现这些抽象类和接口 1.使用abstract实义的类叫做抽象类
 * 2.使用abstract定义的方法叫做抽象方法
 * 
 * @author Mountain
 * 
 */
public abstract class AbstractTest {
	// 3.抽象类中是可以有属性
	String name;

	// 4.抽象类中是可以有方法的实现
	// 4.如果某个类是抽象类，那么该类可以包含具体方法（有声明、有实现）。
	public void show() {
		this.name = "张";
		System.out.println(this.name);
	}

	// 5.抽象类中是可以有构造方法
	// 6。我们不能创建抽象类的对象【实例化】
	public AbstractTest() {
	}

	// 7.使用abstract修饰的方法,抽象方法
	// 在定义抽象方法时在括号后边加上分号：还有一种在什么地方加分号的
	// do while(true);
	public abstract void t();
	// 8.抽象类通过子类继承，
	//抽象类的每个抽象方法需要在子类中实现

}
