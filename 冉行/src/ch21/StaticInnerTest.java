package ch21;

import ch21.StaticInner.Inner;

/**
 * �ڲ���:��̬���ڲ���
 * 
 * @author Mountain
 * 
 */
public class StaticInnerTest {
	public static void main(String[] args) {
		// �����ڲ���Ķ���
		// �ⲿ��.�ڲ��� ������=new �ⲿ��.�ڲ���();��̬�ڲ���
		StaticInner.Inner inner = new StaticInner.Inner();
		// ֱ�ӵ��÷���
		inner.test();
		// �ڶ��ַ�ʽ
		Inner i = new Inner();
		i.test();

	}
}

/**
 * ��:������а�����һ����,������һ����̬���ڲ���
 * 
 * @author Mountain
 * 
 */
class StaticInner {
	// �ھ�̬���ڲ����У�ֻ�ܵ����ⲿ��ľ�̬����������
	private static int a = 0;

	public static void t() {
		System.out.println("a");
	}
	// ��һ�����д���һ���µ���
	// ֻ�����ڲ�����д��̬����
	public static class Inner {
		// ����һ�����Է���
		public void test() {
			System.out.println("����test��������");
			System.out.println(a);
			t();
		}
	}
}
