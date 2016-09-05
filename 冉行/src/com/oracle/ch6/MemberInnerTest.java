package com.oracle.ch6;

public class MemberInnerTest {
		public static void main(String[] args) {
			Out.dema ou=new Out.dema();
			ou.test();
			
		}

		
}
class Out{
	private static int a=0;
	public static void t(){
		System.out.println(a);
	}
	public static class dema{
		public void test(){
			System.out.println("ÎÒÊÇ°×³Õ¡£");
			System.out.println(a);
			t();
		}
	}
}