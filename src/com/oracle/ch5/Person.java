package com.oracle.ch5;

/**
 * ���Ƕ�������ʱ����Ҫ�������ķ������� ע�⣺����д���Ի��߽�����Ա����д��˽�е�
 * 
 * @author Administrator
 * 
 */
public class Person {
	// ���Զ���Ϊ˽�е�
	private String name;
	private int age;

	// ������ǰ����Զ���Ϊ˽�еģ��������������������ʵ���ô��
	// 1.��ʱ������Ҫʹ�÷���������˽�е����ԣ���ȡ����
	// 2.һ������£�����ֵsetXxx(����)���� ��ȡֵgetXxx()����;
	// ���巽��
	// findViewById(R.id.name);
	// ȡ���ı�����.getText();������.setText("1");
	/**
	 * ��������������ֵ
	 * 
	 * @param name
	 *            ����
	 */
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age){
		this.age=age;
	}
	public int getAge(){
		return age;
	}
	public static void main(String[] args) {
		//��������
		Person person = new Person();
		//�������е����Ը�ֵ
		person.setName("����");
		//ȡ�������е�����
		String str = person.getName();
		System.out.println(str);
	}
}
