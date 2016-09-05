 package ch13;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//反人类对象放到ArrayList
		List list =new ArrayList();
		Person person=new Person("张三");
		Person person1=new Person("李四");
		Person person2=new Person("王麻子");
		//添加到集合中去
		list.add(person);
		list.add(person1);
		list.add(person2);
		
		//以前的做法
		for (int i = 0; i < list.size(); i++) {
			//需要进行强制转换
			Person person3=(Person) list.get(i);
			//输出人的名字
			System.out.println(person3.name);
		}
		System.out.println("==================");
		//由于我们强边没有限制他的类型，所以我们只能使用Object来接上
		for(Object person3:list){
			Person person4=(Person)person3;
			System.out.println(person4.name);
		}
		

	}

}
