package ch16;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		//1.����һ��LinkedList���ϣ���������ֻ�ܴ���è
		//2.��Ҫͨ��ѭ������è�Ķ�������ӵ�������
		//3.�������������,ԭ����������Ҫ����һ������
		//1.
		//��̬��ʹ��
		List<Cat> list=new LinkedList<Cat>() ;
		//2.
		for (int i = 0; i < 10; i++) {
			Cat cat=new Cat("С��"+i);
			//��è�Ķ�����ӵ�������ȥ
			list.add(cat);
		}
		//3.
		Animal animal=new Animal("è", list);
		
		//4.�������
		System.out.println(animal.getClassify());
		//5.������е�è��:
		//5.1���ǿ���ֱ�Ӳ�������
		
		for (Cat cat:animal.getList()) {
			System.out.println(cat.getName());
		}
		
		//5.2���ǿ����ȵõ�����
		List<Cat> cats=animal.getList();
		for(Cat cat:cats){
			System.out.println(cat.getName());
		}
		
	}
}
