package com.oracle.ch6;

import java.util.HashSet;
import java.util.Set;
/**
 *   ֻҪ���� ����ͬ���ǾͰѲ���ӵ�Set���� ����ȥ
 * @author Mountain
 *
 */

public class SetDema {
			public static void main(String[] args) {
				Set set=new HashSet<Object>();
				set.add(new Person("��ѩ��ɵ��"));
				set.add(new Person("��ѩ��ɵ��"));
				set.add(new Person("��ѩ��ɵ��"));
				set.add(new Person("��������"));
				set.add(new Person("����"));
				System.out.println(set);
				
			}
}
class Person{
	String name;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	public Person(String name){
		this.name=name;
	}
}
