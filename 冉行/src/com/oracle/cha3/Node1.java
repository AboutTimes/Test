package com.oracle.cha3;
/**
 * 单向循环
 * @author Mountain
 *
 */
public class Node1 {
			String date;
			Node1 next;
			public Node1(String date,Node1 next){
				super();
			this.date=date;
			this.next=next;
				
			
			}
			public static void main(String[] args) {
				Node1 no=new Node1("大哥", null);
				Node1 no1=new Node1("二哥", null);
				Node1 no2=new Node1("三哥", null);
				Node1 no3=new Node1("小哥", null);
				
				no.next=no1;
				no1.next=no2;
				no2.next=no3;
				no3.next=no;
				
				//从三哥得到二哥
				String date=no2.next.next.next.date;
				System.out.println(date);
				//从二哥到小哥
				String date1=no1.next.next.date;
				System.out.println(date1);
				
				//删除二哥
				no1.next=no3;
				no2=null;
				
				//大哥得到小哥
				String date2=no.next.next.date;
				System.out.println(date2);
				
			}
}
