 package ch13;

import java.util.ArrayList;
import java.util.List;

public class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		//���������ŵ�ArrayList
		List list =new ArrayList();
		Person person=new Person("����");
		Person person1=new Person("����");
		Person person2=new Person("������");
		//��ӵ�������ȥ
		list.add(person);
		list.add(person1);
		list.add(person2);
		
		//��ǰ������
		for (int i = 0; i < list.size(); i++) {
			//��Ҫ����ǿ��ת��
			Person person3=(Person) list.get(i);
			//����˵�����
			System.out.println(person3.name);
		}
		System.out.println("==================");
		//��������ǿ��û�������������ͣ���������ֻ��ʹ��Object������
		for(Object person3:list){
			Person person4=(Person)person3;
			System.out.println(person4.name);
		}
		

	}

}
