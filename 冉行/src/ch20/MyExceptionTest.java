package ch20;

public class MyExceptionTest {
	public static void method() throws MyException {
		System.out.println("����һ������");
		// �׳��쳣
		throw new MyException("�����Ϳ�����Ϣ");
	}

	public static void main(String[] args) {
		try {
			// ������ִ�е�����ʱ��ϵͳ���Զ���Ϊ���Ǵ���һ������[���Ƕ�Ӧ���쳣]
			method();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			
			
			if (1 > 2) {
				throw new MyException("1>2");
			} else if (1 < 1) {
				throw new MyException("1<2");
			} else {
				throw new Exception("������������");
			}
			//ֻҪ����һ���쳣�󣬺�ߵ��쳣�Ͳ�����ִ��
			
			// �����ǳ����쳣ʱ����ȥ����һ������
		} catch (MyException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
