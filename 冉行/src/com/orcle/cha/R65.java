package com.orcle.cha;

public class R65 {
			private String name;
			private double speed;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public double getSpeed() {
				return speed;
			}
			public void setSpeed(double speed) {
				this.speed = speed;
			}
			public String toString(){
				StringBuilder sb=new StringBuilder();
				sb.append("����:"+name+",");
				sb.append("�ٶ�:"+speed+"ǧ��/ÿСʱ");
				return sb.toString();
				}
}
