package com.orcle.cha2;

public class Px {
		public static void main(String[] args) {
			int []array={5,2,6,8,2};
			for (int i = 0; i < array.length; i++) {
				for (int j = i+1; j < array.length; j++) {
					if(array[i]>array[j]){
						int t=array[j];
						array[j]=array[i];
						array[i]=t;
					}
				}
			}
			/*for(int i:array){
				System.out.println(i);
				}*/
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		}
}
