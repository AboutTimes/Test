package ch16;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList测试类
 * 
 * @author Administrator
 * 
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//添加方法
		List<Person> list=add();
		//显示时我们需要一个集合吧add方法添加后需要返回一值
		
		show(list);
	}

	private static List<Person> add() {
		// <E>泛型集合：目的是限制你添加的类型
		// 没有写<任何的内容，这里我们可以添加任意的类型>默认是Object类型
		// 这个集合我们只能添加人类进去
		List<Person> list = new ArrayList<Person>();
		// list.add("1");
		System.out.println(list.size());
		// 我们添加信息时通过for我们一定要指定大小
		// 原因：我们的集合创建出来后，默认是为0的
		for (int i = 0; i < 10; i++) {
			Person person = new Person("张三", 10 + i);
			list.add(person);
		}
		return list;

	}

	private static void show(List<Person> list) {
		// 输出
		for (Person p : list) {
			System.out.print("名字" + p.getName());
			System.out.println("年龄" + p.getAge());
		}
	}
}
