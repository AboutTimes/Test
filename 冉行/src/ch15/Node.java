package ch15;

/**
 * ���������
 * 
 * @author Mountain
 * 
 */
public class Node {
	// ��ŵ�����
	String data;
	// ָ��������һ���ڵ�
	Node next;

	/**
	 * ���췽��
	 * 
	 * @param data
	 *            ����
	 * @param next
	 *            ָ����һ���ڵ�
	 */
	public Node(String data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

}
