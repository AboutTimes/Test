package ch6;

public class ObjectTest {
	public static void main(String[] args) {
		Object o = new Object();
		System.out.println(o);
		// ����ֱ��ʹ�ö�����ʱ��Ĭ������ľ���toString()����
		// Object ��� toString ��������һ���ַ��������ַ����������������Ǹ����һ��ʵ������at
		// ��Ƿ���@���ʹ˶����ϣ����޷���ʮ�����Ʊ�ʾ��ɡ����仰˵���÷�������һ���ַ���������ֵ���ڣ�
		// getClass().getName() + '@' + Integer.toHexString(hashCode())

		System.out.println(o.toString());
		// ʮ���� 0-9
		// ������1-0
		// �˽���0-7
		// ʮ������0-9 ABCDEF

		ObjectTest obj = new ObjectTest();
		System.out.println(obj);
	}

	@Override
	public String toString() {
		return "�����������˲��Է�";
	}
}
