package ch15;

public class NodeTest {
	public static void main(String[] args) {
		// 创建第一个节点
		Node node = new Node("我是节点一", null);
		Node node1 = new Node("我是节点二", null);
		Node node2 = new Node("我是节点三", null);
		Node node3 = new Node("我是节点四", null);
		// 让他们产生联系
		// 把第一个节点与第二个节点联系起来
		node.next = node1;
		// 第二个与第三个关联
		node1.next = node2;
		// 第三个与第四个关联
		node2.next = node3;

		// 需求：根据node第一个节点查找到第四个节点
		/*
		 * 根据第一个节点，他的next(第二个节点), next(第三个节点)next(第四个).data节点四
		 */
		String data = node.next.next.next.data;
		System.out.println(data);
		
		//删除node2
		node1.next=node3;
		//下一步就是把node2设置为空
		node2=null;
		//node node1 node3;
		String data1=node.next.next.data;
		System.out.println(data1);
	}
}
