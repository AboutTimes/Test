package com.orcle.cha;

public class R43 {
	
//定义书名，作者，价格
	private static String title;
	private static String auther;
	private static double price;

	public   R43(String title,String auther,double price){
		this.title=title;			//调用
		this.auther=auther;
		this.price=price;
	}
	
	
	public String getTitle(){		//返回
		return title;
	}
	public  String getAuther(){
		return auther;
	}
	public double getPrice(){
		return price;}
	public static void main(String[] args) {
		R43 r=new R43("<java从入门到精通>","明日科技",78.9);
		 
		System.out.println("书名："+title);
		
		System.out.println("作者："+auther);
		
		System.out.println("价格："+price);
		
	}

}


