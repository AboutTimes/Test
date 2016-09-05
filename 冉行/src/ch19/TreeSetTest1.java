package ch19;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTest1 {
	public static void main(String[] args) {
		Set<Cat> set = new TreeSet<Cat>();
		// 添加元素
		set.add(new Cat("小张"));
		set.add(new Cat("小张"));
		set.add(new Cat("小张"));
		set.add(new Cat("小张"));
		set.add(new Cat("小张"));
		System.out.println(set);
	}
}

// 如要向TreeSet中添加对象就是我需要实现Comparable接口，在重写方法
class Cat implements Comparable {
	String name;

	public Cat(String name) {
		this.name = name;
	}
	//进行二个对象的比较:如果返回值是0就是相同的对象
	public int compareTo(Object o) {
		// 如果该对象小于、等于或大于指定对象，
		// 则分别返回负整数、零或正整数。
		// 0表示所有的对象都是同一个
		// -1就可以把对象添加进去
		System.out.println("name"+this.name.hashCode());
		//强制转换
		Cat cat=(Cat)o;
		System.out.println("obj"+cat.name.hashCode());
		
		return 0;//相当于等于0
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}
}
