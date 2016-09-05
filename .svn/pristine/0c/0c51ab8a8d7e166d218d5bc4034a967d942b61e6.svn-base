package com.oracle.ch19;

import java.util.HashSet;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {
		Set<Student> set = new HashSet<Student>();
		Student stu = new Student("张三");
		Student stu1 = new Student("张三");
		set.add(stu);
		set.add(stu1);
		System.out.println(set);
		System.out.println(stu.hashCode() == stu1.hashCode());
	
		Set set1=new HashSet<>();
		String s="张三";
		String s1="张三";
		System.out.println(s.hashCode()==s1.hashCode());
		set1.add(s);
		set1.add(s1);
		System.out.println(set1);
	}
}

class Student {
	String name;

	// 通过构造方法传参
	public Student(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return this.name;
	}
}
