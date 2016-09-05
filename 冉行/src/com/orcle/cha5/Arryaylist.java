package com.orcle.cha5;

import java.util.ArrayList;
import java.util.List;

public class Arryaylist {
		

		public static void main(String[] args) {
			List<Person> list=add();
			show(list);
		}

		

		private static List<Person> add() {
			List<Person> list=new ArrayList<Person>();
			System.out.println(list.size());
			for (int i = 0; i < 20; i++) {
					Person person=new Person("小雪子",10+i);
					list.add(person);
			}
			return list;
		}



		private static void show(List<Person> list) {
			for(Person p:list){
				System.out.println("名字"+p.getName());
				System.out.println("年龄"+p.getAge());
			}
			
		}

}
