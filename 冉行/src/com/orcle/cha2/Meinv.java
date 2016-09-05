package com.orcle.cha2;

import java.util.ArrayList;
import java.util.List;

public class Meinv {
			String name;
			String xh;
			int age;
			
			public Meinv(String name, String xh, int age) {
				this.name=name;
				this.age=age;
				this.xh=xh;
	}
			private int getAge() {
		
		return age;
	}
	private String getXh() {
		
		return xh;
	}
	private String getName() {
		
		return name;
	}

	

			public static void main(String[] args) {
				Meinv fx=new Meinv("方雪","性感妩媚",21);
				Meinv yyj=new Meinv("晏钰杰", "波涛汹涌", 20);
				Meinv mzz=new Meinv("马忠泽", "典型无脑", 23);
				Meinv zdj=new Meinv("朱定杰","少妇诱惑", 18);
				Meinv zjb=new Meinv("朱建波", "少女老成", 90);
				List mnv=new ArrayList();
				mnv.add(fx);
				mnv.add(yyj);
				mnv.add(mzz);
				mnv.add(zdj);
				mnv.add(zjb);
				System.out.println("共有"+mnv.size()+"个佳丽");
				for (int i = 0; i < mnv.size(); i++) {
					Meinv meinv=(Meinv) mnv.get(i);
					System.out.println((i+1)+"号佳丽："+meinv.getName()+"\t"+"类型："+meinv.getXh()+"\t"+"年龄："+meinv.getAge());
					
				}
				
			}

			
}
