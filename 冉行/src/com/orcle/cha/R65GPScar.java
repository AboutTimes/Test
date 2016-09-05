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
				se.append(",坐标：("+getLocation().x+","+getLocation().y+")");
				return se.toString();
			}
			public static void main(String[] args) {
				System.out.println("自定义普通的汽车：");
				R65 r=new R65();
				r.setName("奥迪");
				r.setSpeed(60);
				System.out.println(r);
				System.out.println("自定义	GPS汽车：");
				R65GPScar ps=new R65GPScar();
				ps.setName("大众");
				ps.setSpeed(80);
				System.out.println(ps);
			}

}
