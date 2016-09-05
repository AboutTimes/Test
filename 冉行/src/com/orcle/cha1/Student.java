package com.orcle.cha1;

public class Student {
	private String name;
	private int age;

	public Student() {

	}

	// 带参数的构造方法
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// 写出get和set方法
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		String str = this.name + this.age;
		return str;
	}
}
