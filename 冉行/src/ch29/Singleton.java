package ch29;

public class Singleton {
	// 1.����ģʽ
	//�ڶ��߳���ʵ�ֵ���ģʽ
	private static Singleton sing=new Singleton();
	private Singleton() {

	}
	public static Singleton get() {
		/*���߳��в���ʹ������д��
		if (sing == null) {
			sing = new Singleton();
		}*/
		return sing;
	}

	public void s() {
		System.out.println("���Է���");
	}
}
