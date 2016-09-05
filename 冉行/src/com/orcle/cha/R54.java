package com.orcle.cha;

public class R54 {
	private String name;			//定义属性
	private int age;
	//省略了get()和set()方法的相关代码
	public String setName(){
		return name;
		
	}
	public int setAge(){
		return age;
		
	}
	
	public String toString(){
		return "姓名"+name+",年龄"+age;
	}
	public static void main(String[] args) {
		System.out.println("克隆之前");
		R54 r1=new R54();
	      String a=r1.setName();
	      a="张三";
	      int b=r1.setAge();
	      b=15;
	      System.out.println(a);
	      System.out.println(b);
	      System.out.println("克隆之后");
	      R54 r2=new R54();
	      String s=r2.setName();
	      s="李四";
	      int c=r2.setAge();
	      c=49;
	      System.out.println(s);
	      System.out.println(c);
	      
		
	
		
	}
	
	
}
