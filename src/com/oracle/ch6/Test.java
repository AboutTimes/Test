package com.oracle.ch6;

public class Test {
	public static void main(String[] args) {
		Person p1 = p("����", "С��");
		System.out.println(p1.cat.catName);
		Person p2 =p("����", "��");
		System.out.println(p2.cat.catName);
		// ����Ҫ����������󣬱Ƚ�è�������Ƿ���ͬ
		if (p1.cat.catName.equals(p2.cat.catName)) {
			System.out.println("������ͬ");
		} else {
			System.out.println("���ֲ���ͬ");
		}
	}

	public static Person p(String name, String catName) {
		// �����˵Ķ���
		Person p = new Person();
		// ��������
		p.name = name;
		// p.cat.catName = "С��";
		Cat cat = new Cat();
		// ����è������
		cat.catName = catName;
		// ��Ҫ���˵�Cat���Ը�ֵ
		p.cat = cat;
		return p;
	}
}
