package com.oracle.cha3;
/**
 * ˫��ѭ��
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
					
					de1.date="����";
					de1.next=de2;
					
					de2.date="�°�";
					de2.next=de3;
					
					de3.date="����";
					de3.next=de4;
					
					de4.date="����";
					de4.next=de1;
					
					de4.pr=de3;
					de3.pr=de2;
					de2.pr=de1;
					de1.pr=de4;
					
					
					//�ӵ��굽����   next
					String date=de1.next.next.next.date;
					System.out.println(date);
					
					//�����ӵ��°�    pr
					String date1=de4.pr.pr.date;
					System.out.println(date1);
					
					
		}
}
