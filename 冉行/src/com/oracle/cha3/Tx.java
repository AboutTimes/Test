package com.oracle.cha3;

public class Tx {
		String date;
		Tx next;
		public Tx(){
			
		}
		public Tx(String date,Tx next){
			super();

			this.date=date;
			this.next=next;
		}
      public static void main(String[] args) {
    	  Tx t=new Tx("dema",null);
    	  Tx t1=new Tx("debang",null);
    	  Tx t2=new Tx("jiawen",null);
    	  
    	  t.next=t1;
    	  t1.next=t2;
    	  t2.next=t;
    	  String date=t.next.next.date;
    	 System.out.println(date);
    	  
	}
}
