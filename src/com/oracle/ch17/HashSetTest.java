package com.oracle.ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set集合中的hashSet
 * @author Administrator
 *
 */
public class HashSetTest {
	public static void main(String[] args) {
		//创建set集合
		Set set =new HashSet();
		//添加同样使用add方法
		set.add("abc");
		set.add("123");
		set.add("123");
		set.add("123");
		set.add("123");
		set.add("123");
		set.add("1230");
		set.add("a");
		set.add("b");
		System.out.println(set.size());
		//set集合中的元素是不能重复的
		//取元素,有元素返回false没有返回true
		System.out.println(set.isEmpty());
		
		//输出
		//需要使用Iterator迭代器
		//得到迭代器
		Iterator it=set.iterator();
		//通过循环的方式去操作
		//如果hasNext返回true表示里面还有元素
		System.out.println(it.hasNext());
		while(it.hasNext()){
			//next();相当于我们的变量累加吧
			Object obj=it.next();
			System.out.println(obj);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
