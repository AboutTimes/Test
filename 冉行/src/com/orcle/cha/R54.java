package com.orcle.cha;

public class R54 {
	private String name;			//��������
	private int age;
	//ʡ����get()��set()��������ش���
	public String setName(){
		return name;
		
	}
	public int setAge(){
		return age;
		
	}
	
	public String toString(){
		return "����"+name+",����"+age;
	}
	public static void main(String[] args) {
		System.out.println("��¡֮ǰ");
		R54 r1=new R54();
	      String a=r1.setName();
	      a="����";
	      int b=r1.setAge();
	      b=15;
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println("��¡֮��");
	      R54 r2=new R54();
	      String s=r2.setName();
	      s="����";
	      int c=r2.setAge();
	      c=49;
	      System.out.println(s);
	      System.out.println(c);
	      
		
	
		
	}
	
	
}
