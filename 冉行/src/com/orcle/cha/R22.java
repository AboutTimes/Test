package com.orcle.cha;

public class R22 {
	public static void main(String[] args) {
		int m=1170;
		String r="";
	if(m>200){
		int a=(int)m/200;
		switch(a){
		case 1:
			 r="九折";
			 break;
		case 2:
			 r="八折";
			 break;
		case 3:
			 r="七折";
			 break;
		case 4:
			 r="六折";
			 break;
		default:
			 r="五折";
			
			 
		
		}
		}
	System.out.println("你的消费金额是"+m);
	System.out.println("你所获得折扣是"+r);
	}

}
