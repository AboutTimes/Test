package com.orcle.cha;

public class R63 {
				String name;
				String name1;
				public R63(String name){
					this.name=name;
					this.name1=name1;
				}
				public String getName(){
					
					return name="BMW";
					
				}
				public String getName1(){
					
					return name1="Benz";
					
				}
				public static void main(String[] args) {
					System.out.println("�˿���Ҫ����BMW");
					R63 car=new R63("BMW");
					System.out.println("��ȡ������"+car.getName());
					System.out.println("�˿���Ҫ����Benz");
					R63 car1=new R63("Benz");
					System.out.println("��ȡ������"+car1.getName1());
				}
				
				}
			

