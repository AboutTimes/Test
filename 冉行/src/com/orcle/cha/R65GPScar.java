package com.orcle.cha;

import java.awt.Point;

public class R65GPScar extends R65 implements GPS {

	public Point getLocation() {
		Point point =new Point();
		point.setLocation(super.getSpeed(),super.getSpeed());
		return point;
	}
		  public String toString(){
				StringBuilder se=new StringBuilder();
				se.append(super.toString());
				se.append(",���꣺("+getLocation().x+","+getLocation().y+")");
				return se.toString();
			}
			public static void main(String[] args) {
				System.out.println("�Զ�����ͨ��������");
				R65 r=new R65();
				r.setName("�µ�");
				r.setSpeed(60);
				System.out.println(r);
				System.out.println("�Զ���	GPS������");
				R65GPScar ps=new R65GPScar();
				ps.setName("����");
				ps.setSpeed(80);
				System.out.println(ps);
			}

}
