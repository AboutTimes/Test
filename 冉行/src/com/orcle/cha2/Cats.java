package com.orcle.cha2;

public class Cats {
   
    public static void main(String[] args) {
		String cats[]={"��è","С��è","�׻�è","�ڻ�è","��è"};
		int age[]={2,3,5,6,7};
		for (int i = 0; i < cats.length; i++) {
			System.out.println(cats[i]);
		}
		for (int i = 0; i < age.length; i++) {
			for (int j = i+1; j < age.length; j++) {
				if(age[i]>age[j]){
					int t=age[j];
					age[j]=age[i];
					age[i]=t;
				}
			}
		}
		for(int i:age){
			System.out.println(i);
		}
		
		
	}

}
