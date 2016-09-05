package com.orcle.cha;
import java.util.Date;



public class Text {
		public static void main(String[] args) {
			R59 r=new R59();
			r.setName("Java");
			r.setSalary(100);
			r.setBirthday(new Date());
			Manger manger=new Manger();
			manger.setName("明日科技");
			manger.setSalary(250);
			manger.setBirthday(new Date());
			manger.setBonus(2000);
			System.out.println("员工姓名："+r.getName());
			System.out.println("员工工资："+r.getSalary());
			System.out.println("员工生日："+r.getBirthday());
			System.out.println("经理姓名："+manger.getName());
			System.out.println("经理工资："+manger.getSalary());
			System.out.println("经理生日："+manger.getBirthday());
			System.out.println("经理奖金："+manger.getBonus());
			
		}
}
