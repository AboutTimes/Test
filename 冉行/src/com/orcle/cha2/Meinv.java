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
				Meinv fx=new Meinv("��ѩ","�Ը�����",21);
				Meinv yyj=new Meinv("���ڽ�", "������ӿ", 20);
				Meinv mzz=new Meinv("������", "��������", 23);
				Meinv zdj=new Meinv("�춨��","�ٸ��ջ�", 18);
				Meinv zjb=new Meinv("�콨��", "��Ů�ϳ�", 90);
				List mnv=new ArrayList();
				mnv.add(fx);
				mnv.add(yyj);
				mnv.add(mzz);
				mnv.add(zdj);
				mnv.add(zjb);
				System.out.println("����"+mnv.size()+"������");
				for (int i = 0; i < mnv.size(); i++) {
					Meinv meinv=(Meinv) mnv.get(i);
					System.out.println((i+1)+"�ż�����"+meinv.getName()+"\t"+"���ͣ�"+meinv.getXh()+"\t"+"���䣺"+meinv.getAge());
					
				}
				
			}

			
}
