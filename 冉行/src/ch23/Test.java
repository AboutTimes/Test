package ch23;

//�ݹ飺���Ƿ����Լ���������
public class Test {
	public static void compute(int num) {
		int result = 1;
		for (int i = num; i > 0; i--) {
			result *= i;
		}
		System.out.println(result);
	}

	public static int compute1(int num) {
		System.out.println(num);
		// ����һ���������ڼ���
		int result = num;
		// ��������Ҫ�г���,Ҳ�����˳��÷���
		// �жϵ����Ǵ��������num=1ʱ�����Ǿ��˳��÷���
		if (num == 1) {
			return 1;
		}
		return result + compute1(num - 1);
	}

	// 5*4*3*2*1


	  public static void main(String[] args) {
	 
		compute(5);
		int result = compute1(5);
		System.out.println(result);
	}
}

