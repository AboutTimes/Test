package com.oracle.ch6;




public class ABC {
			R1 r;
			public ABC(R1 r){
				this.r=r;
				
			}
			public void r(){
				r.show();
			}
			public static void main(String[] args) {
				ABC a=new ABC(new R1() {
					public void show() {
						System.out.println("µÂÂêÎ÷ÑÇ");
					}
				});
				a.r();
			}
}
interface R1{
		public void show();
}