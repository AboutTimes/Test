package com.oracle.ch3;

/**
 * 接口的定义：使用interface
 * 1.他是一个特殊的抽象类
 * 2.接口没只有方法的定义[所有的方法都是抽象方法必须在子类中实现]
 * 3.接口不能被实例化，与我们的抽象类一样
 * 4.接口中可以定义属性，但是属性必须赋值
 * @author Mountain
 * 
 */
public abstract interface IA {
	//属性必须赋值初始值String n="";
	//接口中没有方法的实现，所以你不能写构造方法 或者方法public IA(){}
	/*定义三个接口，比如A接口定义一个a方法
		B接口定义一个b方法 
		C接口定义一个c方法
		1.比如一个D类，我需要B接口和C接口的方法 
		2.比如一个E类，我们需要A接口和B接口的方法 
		3.比如一个F类，我们需要ABC接口的方法 
		注意：我们可不可以把接口组合在一起来使用
	*/
	void a();
}
