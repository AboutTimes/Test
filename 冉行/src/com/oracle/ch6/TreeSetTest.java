package com.oracle.ch6;

import java.util.Set;
/**
 * 添加对象到set集合中去
 */
import java.util.TreeSet;

public class TreeSetTest {
		public static void main(String[] args) {
			Set<Dog> set=new TreeSet();
			set.add(new Dog("德玛"));
			set.add(new Dog("德邦"));
			set.add(new Dog("嘉文"));
			set.add(new Dog("卡特"));
			set.add(new Dog("剑圣"));
			System.out.println(set);
		}
}
		class Dog implements Comparable{
			String name;
			
			public Dog(String name){
				this.name=name;
			}

			public int compareTo(Object o) {
				System.out.println("name"+this.name.hashCode());
				Dog dog=(Dog)o;
				System.out.println("obj"+dog.name.hashCode());
				return -1;
			}
			public String toString(){
				return this.name;
			}
		}

