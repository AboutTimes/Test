package com.orcle.cha;

public class R43 {
	
//�������������ߣ��۸�
	private static String title;
	private static String auther;
	private static double price;

	public   R43(String title,String auther,double price){
		this.title=title;			//����
		this.auther=auther;
		this.price=price;
	}
	
	
	public String getTitle(){		//����
		return title;
	}
	public  String getAuther(){
		return auther;
	}
	public double getPrice(){
		return price;}
	public static void main(String[] args) {
		R43 r=new R43("<java�����ŵ���ͨ>","���տƼ�",78.9);
		 
		System.out.println("������"+title);
		
		System.out.println("���ߣ�"+auther);
		
		System.out.println("�۸�"+price);
		
	}

}


