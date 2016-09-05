package com.orcle.cha;

public class R52 {
	
		private String name;			//��������
		private int age;
		private double weight;
		private String color;
		public R52(String name,int age,double weight,String color){
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
			R52 r=(R52)obj;
			return name.equals(r.name)&&(age==r.age)&&(weight==r.weight)&&(color==r.color);//�Ƚ�è������
		}
		public int hashCode(){
			return 7*name.hashCode()+11*new Integer(age).hashCode()+13*new Double(weight).hashCode()+17*color.hashCode();
		}
			
			
			public static void main(String[] args) {
				R52 r1=new R52("java", 23, 21, "��ɫ");		//����
				R52 r2=new R52("C++", 23, 21, "��ɫ");
				R52 r3=new R52("java", 23, 21, "��ɫ");
				System.out.println("è��1�Ź�ϣ��"+r1.hashCode());				//���
				System.out.println("è��2�Ź�ϣ��"+r2.hashCode());
				System.out.println("è��3�Ź�ϣ��"+r3.hashCode());
				System.out.println("è��1�ź�2���Ƿ���ͬ��"+r1.equals(r2));//�Ƚ���ͬ
				System.out.println("è��1�ź�3���Ƿ���ͬ��"+r1.equals(r3));
			}
}

