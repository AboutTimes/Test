package ch15;
/**
 * 单向循环
 * @author Mountain
 *
 */

public class NodeTest1 {
	
	public static void main(String[] args) {
		Node node1=new Node("节点一",null);
		Node node2=new Node("节点二",null);
		Node node3=new Node("节点三",null);
		Node node4=new Node("节点四",null);
		
		//联系起来    
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node1;
		//得到节点三
		String data=node2.next.data;
		System.out.println(data);
		data=node4.next.next.next.data;
		System.out.println(data);
		
		
		
	}
}
