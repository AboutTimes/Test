package ch14;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//��Ҫ����������������ʱ������ʹ�ð�װ��
		Integer integer=new Integer("123");
		//��һ��Integer��װ��ת��int������
		int i=integer.intValue();
		System.out.println(i);
		//Integer��װ�� ��Ӧ���� int
		//Short short
		//Long long
		//Float float
		//Double double
		//Boolean boolean
		//Character char
		//Byte byte
		String str="";
		str.length();
		
		//��һ���ַ�����ת����һ���ַ���
		char[] ch={'��','��','��'};
		//1
		String str1=new String(ch);
		System.out.println(str1);
		
		//2ͨ������String�еķ��� 
		String str2=String.valueOf(ch);
		System.out.println(str2);
	}

}
