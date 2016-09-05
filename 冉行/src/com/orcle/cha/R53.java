package com.orcle.cha;

public class R53 {
	private String name;			//��������
	private int age;
	private double weight;
	private String color;
	public R53(String name,int age,double weight,String color){
		//��ʼ������
		this.name=name;
		this.age=age;
		this.weight=weight;
		this.color=color;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if(obj==null){
			return false;
		}
		if(getClass()!=obj.getClass()){
			return false;
		}
		R53 r=(R53)obj;
		return name.equals(r.name)&&(age==r.age)&&(weight==r.weight)&&(color==r.color);//�Ƚ�è������
	}
		public String toString(){
			StringBuilder sb=new StringBuilder();
			sb.append("���֣�"+name+"\n");
			sb.append("���䣺"+age+"\n");
			sb.append("������"+weight+"\n");
			sb.append("��ɫ��"+color+"\n");
			return sb.toString();
		 
	}
		
		public static void main(String[] args) {
			R53 r1=new R53("java", 23, 21, "��ɫ");		//����
			R53 r2=new R53("C++", 23, 21, "��ɫ");
			R53 r3=new R53("java", 23, 21, "��ɫ");
			System.out.println("è��1��"+r1);				//���
			System.out.println("è��2��"+r2);
			System.out.println("è��3��"+r3);
			
		}
}


