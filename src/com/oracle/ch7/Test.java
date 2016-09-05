package com.oracle.ch7;

public class Test {
	public static void main(String[] args) {
		Animal animal = new Animal();
		System.out.println(animal.toString());
		System.out.println("==============");
		
		Animal animal2=new Animal();
		System.out.println(animal2.toString());
		//现在我创建二个对象，这里他们的执行是如何的
		//静态的语句块只会被执行一次
		//语句块每次创建对象都会执行
		//构造方法每次创建对象都会执行
		
		
		
		
		
	}
}
