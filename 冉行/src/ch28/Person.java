package ch28;

import java.io.Serializable;

//实现一个序列化：把对象保存到记事本等
//1.implements Serializable需要实现这个接口
//2.这个接口中没有任何的方法实现，只是用于标记的

public class Person implements Serializable {
	String name;
	int age;
	static String str="你好";

	public Person() {
	}

	/**
	 * 构造方法
	 * 
	 * @param name
	 * @param age
	 */
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

}
