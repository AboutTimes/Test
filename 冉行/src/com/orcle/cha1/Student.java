package com.orcle.cha1;

public class Student {
	private String name;
	private int age;

	public Student() {

	}

	// �������Ĺ��췽��
	public Student(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	// д��get��set����
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
