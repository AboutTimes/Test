package ch28;

import java.io.Serializable;

//ʵ��һ�����л����Ѷ��󱣴浽���±���
//1.implements Serializable��Ҫʵ������ӿ�
//2.����ӿ���û���κεķ���ʵ�֣�ֻ�����ڱ�ǵ�

public class Person implements Serializable {
	String name;
	int age;
	static String str="���";

	public Person() {
	}

	/**
	 * ���췽��
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
