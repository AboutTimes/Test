package com.orcle.cha;

public class R52 {
	
		private String name;			//定义属性
		private int age;
		private double weight;
		private String color;
		public R52(String name,int age,double weight,String color){
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
			R52 r=(R52)obj;
			return name.equals(r.name)&&(age==r.age)&&(weight==r.weight)&&(color==r.color);//比较猫的属性
		}
		public int hashCode(){
			return 7*name.hashCode()+11*new Integer(age).hashCode()+13*new Double(weight).hashCode()+17*color.hashCode();
		}
			
			
			public static void main(String[] args) {
				R52 r1=new R52("java", 23, 21, "白色");		//创建
				R52 r2=new R52("C++", 23, 21, "黑色");
				R52 r3=new R52("java", 23, 21, "黄色");
				System.out.println("猫咪1号哈希吗："+r1.hashCode());				//输出
				System.out.println("猫咪2号哈希吗："+r2.hashCode());
				System.out.println("猫咪3号哈希吗："+r3.hashCode());
				System.out.println("猫咪1号和2号是否相同："+r1.equals(r2));//比较相同
				System.out.println("猫咪1号和3号是否相同："+r1.equals(r3));
			}
}

