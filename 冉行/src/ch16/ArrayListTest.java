package ch16;

import java.util.ArrayList;
import java.util.List;

/**
 * ArrayList������
 * 
 * @author Administrator
 * 
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//��ӷ���
		List<Person> list=add();
		//��ʾʱ������Ҫһ�����ϰ�add������Ӻ���Ҫ����һֵ
		
		show(list);
	}

	private static List<Person> add() {
		// <E>���ͼ��ϣ�Ŀ������������ӵ�����
		// û��д<�κε����ݣ��������ǿ���������������>Ĭ����Object����
		// �����������ֻ����������ȥ
		List<Person> list = new ArrayList<Person>();
		// list.add("1");
		System.out.println(list.size());
		// ���������Ϣʱͨ��for����һ��Ҫָ����С
		// ԭ�����ǵļ��ϴ���������Ĭ����Ϊ0��
		for (int i = 0; i < 10; i++) {
			Person person = new Person("����", 10 + i);
			list.add(person);
		}
		return list;

	}

	private static void show(List<Person> list) {
		// ���
		for (Person p : list) {
			System.out.print("����" + p.getName());
			System.out.println("����" + p.getAge());
		}
	}
}
