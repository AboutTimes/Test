package ch15;
/**
 * ����ѭ��
 * @author Mountain
 *
 */

public class NodeTest1 {
	
	public static void main(String[] args) {
		Node node1=new Node("�ڵ�һ",null);
		Node node2=new Node("�ڵ��",null);
		Node node3=new Node("�ڵ���",null);
		Node node4=new Node("�ڵ���",null);
		
		//��ϵ����    
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node1;
		//�õ��ڵ���
		String data=node2.next.data;
		System.out.println(data);
		data=node4.next.next.next.data;
		System.out.println(data);
		
		
		
	}
}
