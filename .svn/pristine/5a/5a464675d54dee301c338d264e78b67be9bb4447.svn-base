package com.oracle.ch21;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Anonymous {
	public static void main(String[] args) {
		Set set = new TreeSet(new Comparator() {
			@Override
			public int compare(Object o1, Object o2) {
				Person p = (Person) o1;
				Person p1 = (Person) o2;
				return p.name.hashCode() - p1.name.hashCode();
			}

		});
		set.add(new Person("张三"));
		set.add(new Person("李四"));
		System.out.println(set);
	}
}

// 把一个人类对象添加到TreeSet中
class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}
}