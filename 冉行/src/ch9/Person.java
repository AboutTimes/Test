package ch9;

public class Person {
	String name;

	public Person(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public static void main(String[] args) {
		Person person[] = new Person[5];
		for (int i = 0; i < person.length; i++) {
			Person p = new Person("����" + i);
			person[i] = p;
		}
		for (int i = 0; i < person.length; i++) {
			// System.out.println(person[i].name);
			// 1.��ʹ��Person������
			Person p = person[i];
			System.out.println(p.name);
		}
		// ��1��һ������N��ֻCAT��
		// Ҫ������û������� cat��������һ������������int���͵ı�������
		
		// [2]��������������
		//ʾ����int []array={5,2,6,8,2};
		//�����Ľ��Ϊ;2,2,5,6,8
		
		// ��3��һ������N��ֻCAT��
		// Ҫ������û������� cat��������һ������������int���͵ı�������
		//�����Cat����������С�����
	}

}
