package com.orcle.cha;

public class R51 {
		private String name;			//定义属性
		private int age;
		private double weight;
		private String color;
		public R51(String name,int age,double weight,String color){
			//初始化属性
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
			R51 r=(R51)obj;
			return name.equals(r.name)&&(age==r.age)&&(weight==r.weight)&&(color==r.color);//比较猫的属性
		}
			public String toString(){
				StringBuilder sb=new StringBuilder();
				sb.append("名字："+name+"\n");
				sb.append("年龄："+age+"\n");
				sb.append("重量："+weight+"\n");
				sb.append("颜色："+color+"\n");
				return sb.toString();
			 
		}
			
			public static void main(String[] args) {
				R51 r1=new R51("java", 23, 21, "白色");		//创建
				R51 r2=new R51("C++", 23, 21, "黑色");
				R51 r3=new R51("java", 23, 21, "黄色");
				System.out.println("猫咪1号"+r1);				//输出
				System.out.println("猫咪2号"+r2);
				System.out.println("猫咪3号"+r3);
				System.out.println("猫咪1号和2号是否相同："+r1.equals(r2));//比较相同
				System.out.println("猫咪1号和3号是否相同："+r1.equals(r3));
			}
}
