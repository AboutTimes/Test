package com.orcle.cha;

import java.util.Random;

public class R50 {
				private static int counter=0;	//定义一个计算器
				public R50(String title){
					System.out.println("售出图书"+title); 		//输出书名
					counter++;							//计算器+1
					
				}
				public static int getCounter(){
					return counter;					//获得结果
				}
				public static void main(String[] args) {
					//创建书名数组
					String[]titles={
							"《java从入门到精通（第2版）》","《java编程辞典》","《视频学java》"
					};
					for(int i=0;i<5;i++){
						new R50(titles[new Random().nextInt(3)]);	//利用书名数组创建Book（R50）对象
					}
					System.out.println("总计销售了"+R50.getCounter()+"本图书！");//输出创建对象的个数
				}
}
