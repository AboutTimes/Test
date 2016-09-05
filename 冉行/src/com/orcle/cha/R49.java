package com.orcle.cha;

public class R49 {
		private String name;		//定义
		private String gender;
		private int age;
		public  R49(){				//创建方法
			System.out.println("使用无参构造方法创建对象");
		}
		public R49(String name,String gender,int age){
			this.name=name;			//利用构造方法初始化域
			this.gender=gender;
			this.age=age;	
			System.out.println("使用有参构造方法创建对象");
		}
		public String getName(){		//获得名字、性别、年龄
			return name;
		}
		public String getGender(){
			return gender;
		}
		public int getAge(){
			return age;
		}
		public static void main(String[] args) {
			R49 n1=new R49();		//创建对象
			System.out.println("员工姓名："+n1.getName());
			System.out.println("员工性别："+n1.getGender());
			System.out.println("员工年龄"+n1.getAge());
			R49 n2=new R49("方雪","女子",18);
			System.out.println("员工姓名："+n2.getName());
			System.out.println("员工性别"+n2.getGender());
			System.out.println("员工年龄"+n2.getAge());
			
		}
}
