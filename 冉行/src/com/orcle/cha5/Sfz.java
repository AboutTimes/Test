package com.orcle.cha5;

import java.util.Scanner;

public class Sfz {
		
		public static void main(String[] args) {
			String sf;
			String sj;
			String zj;
			String f="n";
			Scanner sc=new Scanner(System.in);
			while(f.equals("n")){
				System.out.println("请输入身份证号码：");
				String str=sc.next();
				System.out.println("请输入手机号码：");
				String str1=sc.next();
				System.out.println("请输入座机号码：");
				String str2=sc.next();
				
				int i=str2.indexOf("-");
				
				String t=str2.substring(i+1);
				if((str.length()==16 || str.length()==18) && (str1.length()==11) && (i==4 && t.length()==7))
				{	System.out.println("注册成功");
					}else if((str.length()!=16 || str.length()!=18)){
						System.out.println("身份证号码必须是16位或18位");
					}else if((str1.length()!=11)){
						System.out.println("手机号码必须是11位");
					}else if((i!=4 && t.length()!=7)){
						System.out.println("座机号码区号必须是4位，后面是7位");
					}
				}
			
		}
}
			
			
		
			
	
				
			
		
			 
		
	
				
			
			 


