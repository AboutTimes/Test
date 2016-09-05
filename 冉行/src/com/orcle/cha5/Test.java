package com.orcle.cha5;

import java.util.LinkedList;
import java.util.List;

import ch16.Cat;

public class Test {
		public static void main(String[] args) {
			List<Dog> list=new LinkedList<Dog>();
			for (int i = 0; i < 5; i++) {
				Dog dog=new Dog("恶狗"+i);
				
				list.add(dog);
			}
			Animal animal=new Animal("狗",list);
			System.out.println(animal.getDag());
			for (Dog dog:animal.getList()) {
				System.out.println(dog.getName());
			}
			
			//5.2我们可以先得到集合
			List<Dog> dogs=animal.getList();
			for(Dog  dog:dogs){
				System.out.println(dog.getName());
			}
		}
}
