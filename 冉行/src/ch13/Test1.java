package ch13;

/**
 * �ɱ����:���������ֵ���Զ�̬
 * 
 * @author
 * 
 */
public class Test1 {

	public static void main(String[] args) {
		Test1 test1 = new Test1();
		test1.add(1, 2, 3, 4, 5, 6, 6, 54, 4, 4, 3, 3, 2, 2);
		Person person = new Person("����");
		Person person1 = new Person("����");
		Person person2 = new Person("����");
		Person person3 = new Person("��С��");
		Person person4 = new Person("����");
		test1.add(person, person1, person2, person3, person4);
		
	}

	/**
	 * �ɱ�����ķ��� int... i��ʵ������һ������ ���
	 * 
	 * @param i
	 */
	public void add(int... i) {
		// ���ǲ���ʱ��������ķ�ʽȥ����
		for (int j : i) {
			System.out.println(j);
		}
	}

	/**
	 * ʹ������������Ϊ�ɱ����
	 * 
	 * @param persons
	 */
	public void add(Person... persons) {
		for(Person p:persons){
			System.out.println(p.name);
		}
	}

}
