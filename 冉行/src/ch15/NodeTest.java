package ch15;

public class NodeTest {
	public static void main(String[] args) {
		// ������һ���ڵ�
		Node node = new Node("���ǽڵ�һ", null);
		Node node1 = new Node("���ǽڵ��", null);
		Node node2 = new Node("���ǽڵ���", null);
		Node node3 = new Node("���ǽڵ���", null);
		// �����ǲ�����ϵ
		// �ѵ�һ���ڵ���ڶ����ڵ���ϵ����
		node.next = node1;
		// �ڶ��������������
		node1.next = node2;
		// ����������ĸ�����
		node2.next = node3;

		// ���󣺸���node��һ���ڵ���ҵ����ĸ��ڵ�
		/*
		 * ���ݵ�һ���ڵ㣬����next(�ڶ����ڵ�), next(�������ڵ�)next(���ĸ�).data�ڵ���
		 */
		String data = node.next.next.next.data;
		System.out.println(data);
		
		//ɾ��node2
		node1.next=node3;
		//��һ�����ǰ�node2����Ϊ��
		node2=null;
		//node node1 node3;
		String data1=node.next.next.data;
		System.out.println(data1);
	}
}
