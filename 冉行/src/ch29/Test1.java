package ch29;

public class Test1 extends Thread {
	public Test1() {
	}

	/**
	 * �����ǵ��߳�ȡ��һ���µ�����
	 * 
	 * @param name
	 */
	public Test1(String name) {
		// ���ø���Ĺ��췽����super(����д�ϲ���);
		super(name);
	}

	public static void main(String[] args) {
		Test1 t = new Test1("���Ǵ�С�Ʋ�����");
		// /�õ���ǰ�̵߳�����
		System.out.println("��ǰ�̵߳�����" + t.getName());
	}
}
