package ch10;

public class Cat {
	// ��1��һ������N��ֻCAT��
	// Ҫ������û������� cat��
	// ������һ������������int���͵ı�������
	int age;
	String name;

	public Cat(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "è������" + this.name + "è�����䣺" + this.age;
	}
}
