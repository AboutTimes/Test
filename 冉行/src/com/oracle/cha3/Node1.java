package com.oracle.cha3;
/**
 * ����ѭ��
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
				Node1 no=new Node1("���", null);
				Node1 no1=new Node1("����", null);
				Node1 no2=new Node1("����", null);
				Node1 no3=new Node1("С��", null);
				
				no.next=no1;
				no1.next=no2;
				no2.next=no3;
				no3.next=no;
				
				//������õ�����
				String date=no2.next.next.next.date;
				System.out.println(date);
				//�Ӷ��絽С��
				String date1=no1.next.next.date;
				System.out.println(date1);
				
				//ɾ������
				no1.next=no3;
				no2=null;
				
				//���õ�С��
				String date2=no.next.next.date;
				System.out.println(date2);
				
			}
}
