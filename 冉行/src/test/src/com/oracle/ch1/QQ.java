package test.src.com.oracle.ch1;

public class QQ extends Car {
	// ���������û�д������Ĺ��췽���������������в�����д����
	public QQ() {
		super();
		// ���ø����е�����ʹ��super.����
		// ���ø����еķ���ʹ��super.����();
	}

	// �ɲ�����������������µĹ��췽��
	// ע������������еĹ��췽���������оͱ���Ҫ��
	public QQ(String name) {
		this.name = name;
	}

	/**
	 * д�Ǵ������Ĺ��췽�� ��������ʽ�Ĺ��췽����Ҫ��д
	 * 
	 * @param name
	 * @param color
	 */
	public QQ(String name, String color) {
		super(name, color);
	}

	// ����������Car���������Ժͷ���˽�еģ�final,static
	@Override
	public void driver() {
		super.driver();
		super.name="С��";
	}
}
