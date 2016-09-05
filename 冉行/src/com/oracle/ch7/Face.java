package com.oracle.ch7;

public class Face {
		public int compute(int num){
			System.out.println(num);
			if(num==1 || num==2){
				return 1;
			}
			return compute(num-1)+compute(num-2);
			
		}
		public static void main(String[] args) {
			Face f=new Face();
			int i= f.compute(5);
			System.out.println(f);
		}
}
