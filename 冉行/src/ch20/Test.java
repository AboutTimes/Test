package ch20;

public class Test {
	public static void method() {
		
		try {
			System.out.println("try��䱻ִ��");
			//return;try����ִ��finally��ִ�У���ߵĴ��벻��ִ��
			//�˳�java�����,�˳�����Ӧ�ó���
			System.exit(0);
		} catch (Exception e) {
			System.out.println("catch��ִ��");
		} finally {
			System.out.println("finally��ִ��");
		}
		System.out.println("������ִ��");
	}

	public static void main(String[] args) {
		method();
	}
}
