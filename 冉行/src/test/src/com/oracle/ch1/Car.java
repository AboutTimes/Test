package test.src.com.oracle.ch1;

/**
 * �����ࣺ��Ҫ���ð������������Ժ�һ������
 * 
 * @author Mountain �������е��඼ֱ�ӻ��߼�ӵļ̳����Ǹ���Object
 * 
 */
public class Car {
	// ��������������
	String name;
	String color;

	/**
	 * ��ʻ�����ķ���
	 */
	public void driver() {
		System.out.println("С���������");
	}

	/**
	 * �������Ĺ��췽��
	 * 
	 * @param name
	 *            ����������
	 * @param color
	 *            ��������ɫ
	 */
	public Car(String name, String color) {
		this.name = name;
		this.color = color;
	}
	public Car(){
		
	}
}
