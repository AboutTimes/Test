package ch20;

/**
 * �Զ����쳣:������Ҫ�̳���Exception
 * 
 * @author Administrator
 * 
 */
public class MyException extends Exception {
	public MyException() {

	}

	// ��дһ�����췽�����������
	public MyException(String message) {
		// �Ѳ����������ǵĸ���
		super(message);
	}
	
	
}
