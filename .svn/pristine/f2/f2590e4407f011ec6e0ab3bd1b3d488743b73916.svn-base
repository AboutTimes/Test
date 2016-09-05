package com.oracle.ch15;

/**
 * 双向链表的实现
 * 
 * @author Mountain
 * 
 */
public class Node2Test {
	public static void main(String[] args) {
		//创建Node2对象
		Node2 node1= new Node2();
		Node2 node2= new Node2();
		Node2 node3= new Node2();
		Node2 node4= new Node2();
		//给node1添加数据，在添加后继元素
		node1.data="节点一";
		node1.next=node2;
		
		//给node2添加数据，在添加后继元素
		node2.data="节点二";
		node2.next=node3;
		//给node3添加数据，在添加后继元素
		node3.data="节点三";
		node3.next=node4;
		
		//给node4添加数据，在添加后继元素(node1)
		node4.data="节点四";
		node4.next=node1;
		
		//添加前驱
		//从node1开始，node4
		node1.pr=node4;
		//node4的前驱元素
		node4.pr=node3;
		node3.pr=node2;
		node2.pr=node1;
		
		//从四个节点中得到节点三，开始都是从node1开始
		//使用后继元素的方式
		//第一个next是节点2 第二个next是节点3
		String data=node1.next.next.data;
		System.out.println(data);
		
		//使用前驱的方式
         //第一个前驱pr就是节点4 第二个pr前驱就是节点3
		data=node1.pr.pr.data;
		System.out.println(data);
		
		//删除节点3
		//1.先把node4的前驱指向node2
		//2.把node2的后继元素指向node4
		//3.把node3设置为空
		
		node4.pr=node2;
		node2.next=node4;
		
		//3.把node3设置为空
		node3=null;
		node3.pr=null;
		node3.next=null;
		
		
		
	}
}
