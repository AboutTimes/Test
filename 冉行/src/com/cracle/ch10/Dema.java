package com.cracle.ch10;

public class Dema extends Thread{
	public Dema(){
		
	}
	public Dema(String name){
		super(name);
	}
	public static void main(String[] args) {
		Dema de=new Dema("我们村花是方雪");
		System.out.println("快来看呀！"+de.getName());
	}
}
