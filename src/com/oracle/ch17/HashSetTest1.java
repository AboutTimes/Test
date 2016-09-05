package com.oracle.ch17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ����HashSet������������
 * ��һ��map�е�hashMap
 * ���Ǿͻ�ʹ�ã������зż���
 * @author Mountain
 * 
 */
public class HashSetTest1 {
	public static void main(String[] args) {
		//1.����һ��HashSet����
		//2.ͨ��for���������󵽼�����ȥ
		//3.ͨ������������������е�����
		//1.
		Set<Person> set=new HashSet<Person>();
		//2.
		for (int i = 0; i < 10; i++) {
			Person person =new Person("С����", 1+i);
			//��ӵ�������ȥ
			set.add(person);
		}
		//3.������
		//Iterator<Person> it=set.iterator();
		//for (Iterator<Person> it=set.iterator();it.hasNext();) {
		//}
		Iterator<Person> it=set.iterator();
		for(;it.hasNext();){
			Person p=it.next();
			System.out.print(p.getName());
			System.out.print(p.getAge()+"\n");
		}
		System.out.println("=====while=================");
		//����ʹ�õ�����ʱ��ֻ��ʹ��һ��
		//�㻹��Ҫʹ��ʱ�����¸�ֵ
		it=set.iterator();
		while(it.hasNext()){
			Person p =it.next();
			System.out.print(p.getName());
			System.out.print(p.getAge()+"\n");
		}
	}
}
