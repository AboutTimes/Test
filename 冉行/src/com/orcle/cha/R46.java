package com.orcle.cha;

public class R46 {
			private static R46 r46=null;// 声明一个r46类的引用
			private R46(){}				//将构造方法私有
			public static R46 getInstance(){	//实例化引用
				if(r46==null){
					r46=new R46();
				}
				return r46;
				
			}
			public void getName(){				//使用普通方法输出皇帝名字
				System.out.println("我是皇帝，我最大！");
				System.out.println("德玛西亚爱的");
			}
}
