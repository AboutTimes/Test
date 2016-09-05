package com.orcle.cha;
import java.util.Scanner;//打包
public class R44 {
	public double getFar(double c){
		double far=1.8*c+32; //定义double的运算
	
		return far;   //返回的值
		
	}
	public static void main(String[] args) {
		System.out.println("请输入要转换的温度：（单位摄氏度）");  
		 Scanner in=new Scanner(System.in);//创建新对象
		  double c=in.nextDouble(); //输入值
		  R44 r=new R44(); //创建新对象
		  double far=r.getFar(c); // 调用对象与方法
		  System.out.println("转换完成的温度："+far);
		  
	}
}
