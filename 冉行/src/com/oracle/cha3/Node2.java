package com.oracle.cha3;
/**
 * 双向循环
 * @author Administrator
 *
 */
public class Node2 {
		String date;
		Node2 pr;
		Node2 next;
		public Node2(){
			
		}
		public Node2(String date,Node2 pr,Node2 next){
			super();
			this.date=date;
			this.pr=pr;
			this.next=next;
		}
		public static void main(String[] args) {
					Node2 de1=new Node2();
					Node2 de2=new Node2();
					Node2 de3=new Node2();
					Node2 de4=new Node2();
					
					de1.date="德玛";
					de1.next=de2;
					
					de2.date="德邦";
					de2.next=de3;
					
					de3.date="盖伦";
					de3.next=de4;
					
					de4.date="喷子";
					de4.next=de1;
					
					de4.pr=de3;
					de3.pr=de2;
					de2.pr=de1;
					de1.pr=de4;
					
					
					//从德玛到喷子   next
					String date=de1.next.next.next.date;
					System.out.println(date);
					
					//从喷子到德邦    pr
					String date1=de4.pr.pr.date;
					System.out.println(date1);
					
					
		}
}
