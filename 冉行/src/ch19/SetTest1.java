package ch19;

import java.util.HashSet;
import java.util.Set;

/**
 * ֻҪ�����е�������ͬ�Ͳ���Ӹö���Set������ȥ
 * 
 * @author Administrator
 * 
 */
public class SetTest1 {
	public static void main(String[] args) {
		Set set = new HashSet<Object>();
		//���������ͬ���ҾͲ��Ѷ�����ӵ�������
		//��ʱ������Ҫ��дhashCode��equals����
		set.add(new Person("����"));
		set.add(new Person("����"));
		System.out.println(set);
	}
}

class Person {
	String name;

	@Override
	public int hashCode() {
		// ����ֵ����������Ҫ�޸�
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		// �������������ʱ����ͬһ����ͷ���false
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
			//�������Ѷ���������������ͬ����Ϣ��ӵ�������ʱ
			//(name.equals(other.name)���߲���дhashCode��equals
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	public Person(String name) {
		this.name = name;
	}
	// ��дhashCode��equals����

}
