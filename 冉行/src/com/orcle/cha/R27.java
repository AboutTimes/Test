package com.orcle.cha;
import java.math.BigDecimal;
public class R27 {
		public static void main(String[] args) {
			BigDecimal s=new BigDecimal(0.0);
			BigDecimal c=new BigDecimal(1.0);
			int i=1;
			while(i<=20){
				s=s.add(c);
				++i;
				c=c.multiply(new BigDecimal(1.0/i));
				
			}
			System.out.println("计算结果等于："+s);
		}
}
