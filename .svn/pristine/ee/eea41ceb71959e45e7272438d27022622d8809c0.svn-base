package com.oracle.ch1;
import java.util.Scanner;
public class Sb1 {
	public static void main(String[] args) {
		

		/*
		 *  登录验证通过后，显示批发商品信息;
		 *  输入批发商品编号和数量，以指定格式显示总金额
		 */
	
			
			
				Scanner sc=new Scanner(System.in);
				System.out.println("请输入用户名：");
				String a=sc.next();
				System.out.println("请输入登录密码：");
				String b=sc.next();
				if(a.equals("TOM")&&b.equals("123456")){
					System.out.println("登录成功！");
					System.out.println("*****欢迎进入商品批发城*****");
					System.out.println("编号：1，商品：电风扇，价格：124.23元");
					System.out.println("编号：2，商品：洗衣机，价格：4500.0元");
					System.out.println("编号：3，商品：电视机，价格：8800.9元");
					System.out.println("编号：4，商品：冰箱，价格：5000.88元");
					System.out.println("编号：5，商品：空调，价格：4456.0元");
					System.out.println("******************");
					System.out.println("请输入您批发的编号：");
					int  c=sc.nextInt();
					System.out.println("请输入批发数量：");
					int  d=sc.nextInt();
			
					String a1=String.valueOf(d*124.23);
					String  a2=String.valueOf(d*4500.0);
					String  a3=String.valueOf(d*8800.9);
					String  a4=String.valueOf(d*5000.88);
					String  a5=String.valueOf(d*4456.0);
					
					StringBuffer s1=new StringBuffer(a1);
					for (int i = s1.length()-3; i >0; i=i-3) {
						s1.insert(i,',');
					}
					StringBuffer s2=new StringBuffer(a2);
					for (int i = s2.length()-3; i >0; i=i-3) {
						s2.insert(i,',');
					}
					StringBuffer s3=new StringBuffer(a3);
					for (int i = s3.length()-3; i >0; i=i-3) {
						s3.insert(i,',');
					}
					StringBuffer s4=new StringBuffer(a4);
					for (int i = s4.length()-3; i >0; i=i-3) {
						s4.insert(i,',');
					}
					StringBuffer s5=new StringBuffer(a5);
					for (int i = s5.length()-3; i >0; i=i-3) {
						s5.insert(i,',');
					}
					
					
					if(c==1){
						System.out.println("您需要付款："+s1+"元");
					}else if(c==2){
						System.out.println("您需要付款："+s2+"元");
					}else if(c==3){
						System.out.println("您需要付款："+s3+"元");
					}else if(c==4){
						System.out.println("您需要付款："+s4+"元");
					}else{
						System.out.println("您需要付款："+s5+"元");
					}
					}
				}
	}
			

