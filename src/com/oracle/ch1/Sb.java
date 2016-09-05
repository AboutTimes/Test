package com.oracle.ch1;

import java.util.Scanner;

public class Sb {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ÇëÊäÈëÒ»´®×Ö·û");
		String a=sc.next();
		StringBuffer b=new StringBuffer(a);
		for(int i=b.length()-3;i>0;i=i-3){
			b.insert(i,',');
		}
		System.out.println(b);
	}
}
