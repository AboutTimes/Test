package com.orcle.cha;

public class R62 {
			private String name;
			private int r;
			private double length;
			private double width;
			public R62(int r,double length,double width){
				this.length=length;
				this.width=width;
				this.r=r;
			}
			public String getName(){
				return this.name=name;
			}
			public Double getArea(){
				return Math.PI*Math.pow(r,2);
			}
			public Double getArea1(){
				return length*width;
			}
			public static void main(String[] args) {
				R62 y=new R62(2, 3, 4);
				System.out.println("圆形的面积是："+y.getArea());
				System.out.println("矩形的面积是："+y.getArea1());
				
			}
}
