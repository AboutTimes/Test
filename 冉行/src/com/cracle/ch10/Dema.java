package com.cracle.ch10;

public class Dema extends Thread{
	public Dema(){
		
	}
	public Dema(String name){
		super(name);
	}
	public static void main(String[] args) {
		Dema de=new Dema("���Ǵ廨�Ƿ�ѩ");
		System.out.println("������ѽ��"+de.getName());
	}
}
