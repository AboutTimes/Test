package com.oracle.ch15;

public class Node2 {
	// ǰ��Ԫ��,����һ��Node2
	// previous������д��
	Node2 pr;
	// ���
	Node2 next;

	// ��Ҫ���ǵ�����
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
