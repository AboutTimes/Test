package ch15;

/**
 * 单向的链表
 * 
 * @author Mountain
 * 
 */
public class Node {
	// 存放的数据
	String data;
	// 指向他的下一个节点
	Node next;

	/**
	 * 构造方法
	 * 
	 * @param data
	 *            数据
	 * @param next
	 *            指向下一个节点
	 */
	public Node(String data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

}
