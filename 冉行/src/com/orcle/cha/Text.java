package com.orcle.cha;
import java.util.Date;



public class Text {
		public static void main(String[] args) {
			R59 r=new R59();
			r.setName("Java");
			r.setSalary(100);
			r.setBirthday(new Date());
			Manger manger=new Manger();
			manger.setName("���տƼ�");
			manger.setSalary(250);
			manger.setBirthday(new Date());
			manger.setBonus(2000);
			System.out.println("Ա��������"+r.getName());
			System.out.println("Ա�����ʣ�"+r.getSalary());
			System.out.println("Ա�����գ�"+r.getBirthday());
			System.out.println("����������"+manger.getName());
			System.out.println("�����ʣ�"+manger.getSalary());
			System.out.println("�������գ�"+manger.getBirthday());
			System.out.println("������"+manger.getBonus());
			
		}
}
