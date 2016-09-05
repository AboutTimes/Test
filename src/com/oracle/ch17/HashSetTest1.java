package com.oracle.ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 测试HashSet中添加人类对象
 * 看一看map中的hashMap
 * 我们就会使用，集合中放集合
 * @author Mountain
 * 
 */
public class HashSetTest1 {
	public static void main(String[] args) {
		//1.创建一个HashSet集合
		//2.通过for添加人类对象到集合中去
		//3.通过迭代器输出里面所有的人类
		//1.
		Set<Person> set=new HashSet<Person>();
		//2.
		for (int i = 0; i < 10; i++) {
			Person person =new Person("小李子", 1+i);
			//添加到集合中去
			set.add(person);
		}
		//3.迭代器
		//Iterator<Person> it=set.iterator();
		//for (Iterator<Person> it=set.iterator();it.hasNext();) {
		//}
		Iterator<Person> it=set.iterator();
		for(;it.hasNext();){
			Person p=it.next();
			System.out.print(p.getName());
			System.out.print(p.getAge()+"\n");
		}
		System.out.println("=====while=================");
		//我们使用迭代器时，只有使用一次
		//你还需要使用时，重新赋值
		it=set.iterator();
		while(it.hasNext()){
			Person p =it.next();
			System.out.print(p.getName());
			System.out.print(p.getAge()+"\n");
		}
	}
}
