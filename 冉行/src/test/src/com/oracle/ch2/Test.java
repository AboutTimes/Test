package test.src.com.oracle.ch2;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// ͨ�������ഴ������Ŀǰ�ķ�ʽ��ʹ�ö�̬������
		AbstractTest test = new ExtendsAbs();
		test.name = "СС";
		// ���� show����
		test.show();
		// ����t()����
		test.t();
		/*
		 * 6. ���ۺ��������ֻҪһ�����ǳ����࣬
		 * ��ô�������޷�ʵ������
		 * ������ֻ��ͨ����̬�ķ�ʽȥ��������{Ҳ��ʵ����}
		 */
	}

}
