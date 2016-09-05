package com.oracle.ch15;

public class Node2 {
	// 前驱元素,就是一个Node2
	// previous完整的写法
	Node2 pr;
	// 后继
	Node2 next;

	// 需要我们的数据
	String data;
	public Node2(){
		
	}

	public Node2(Node2 pr, Node2 next, String data) {
		super();
		this.pr = pr;
		this.next = next;
		this.data = data;
	}

}
