package com.orcle.cha;

public class R49 {
		private String name;		//����
		private String gender;
		private int age;
		public  R49(){				//��������
			System.out.println("ʹ���޲ι��췽����������");
		}
		public R49(String name,String gender,int age){
			this.name=name;			//���ù��췽����ʼ����
			this.gender=gender;
			this.age=age;	
			System.out.println("ʹ���вι��췽����������");
		}
		public String getName(){		//������֡��Ա�����
			return name;
		}
		public String getGender(){
			return gender;
		}
		public int getAge(){
			return age;
		}
		public static void main(String[] args) {
			R49 n1=new R49();		//��������
			System.out.println("Ա��������"+n1.getName());
			System.out.println("Ա���Ա�"+n1.getGender());
			System.out.println("Ա������"+n1.getAge());
			R49 n2=new R49("��ѩ","Ů��",18);
			System.out.println("Ա��������"+n2.getName());
			System.out.println("Ա���Ա�"+n2.getGender());
			System.out.println("Ա������"+n2.getAge());
			
		}
}
