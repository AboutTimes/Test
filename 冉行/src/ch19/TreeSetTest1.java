package ch19;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		Set<Cat> set = new TreeSet<Cat>();
		// ���Ԫ��
		set.add(new Cat("С��"));
		set.add(new Cat("С��"));
		set.add(new Cat("С��"));
		set.add(new Cat("С��"));
		set.add(new Cat("С��"));
		System.out.println(set);
	}
}

// ��Ҫ��TreeSet����Ӷ����������Ҫʵ��Comparable�ӿڣ�����д����
class Cat implements Comparable {
	String name;

	public Cat(String name) {
		this.name = name;
	}
	//���ж�������ıȽ�:�������ֵ��0������ͬ�Ķ���
	public int compareTo(Object o) {
		// ����ö���С�ڡ����ڻ����ָ������
		// ��ֱ𷵻ظ������������������
		// 0��ʾ���еĶ�����ͬһ��
		// -1�Ϳ��԰Ѷ�����ӽ�ȥ
		System.out.println("name"+this.name.hashCode());
		//ǿ��ת��
		Cat cat=(Cat)o;
		System.out.println("obj"+cat.name.hashCode());
		
		return 0;//�൱�ڵ���0
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
