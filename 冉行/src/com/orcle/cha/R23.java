package com.orcle.cha;
import java.util.Scanner;
public class R23 {
		public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("请输入月份");
				int a;
				a=s.nextInt();
				switch(a){
				case 12:
				case 1:
				case 2:
					System.out.println("大约在冬季");
					break;
				case 3:
				case 4:
				case 5:
					System.out.println("春天里");
					break;
				case 6:
				case 7:
				case 8:
					System.out.println("这是个大热天");
					break;
				case 9:
				case 10:
				case 11:
					System.out.println("适合穿秋裤的季节，穿秋裤的男人最帅！");
					break;
				default:
					System.out.println("哥们儿，才做了春梦不是！");
					
				
				}
		}
}
