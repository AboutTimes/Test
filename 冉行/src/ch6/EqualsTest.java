package ch6;

public class EqualsTest {
	public static void main(String[] args) {
		Object object="33";
		//Object��equalse����
		/**
		 * public boolean equals(Object obj) {
        	return (this == obj);
        	this��ʾ��ǰ����
        	obj�����Ǵ�������Ķ���
    		}
		 */
		boolean b=object.equals(object);
		System.out.println(b);
		b=object.equals(33);
		System.out.println(b);
		/**
		 * String ��equals�����������ʵ�ֵ�
		 */
		//��������String����
		String str=new String("����");
		String str1=new String("����");
		System.out.println(str.equals(str1));
		String str2="����";
		System.out.println(str.equals(str2));
		String str3="����";
		System.out.println(str2.equals(str3));
		
		String h=new String("helloworld");
		String h1=new String("hello");
		String h2="world";
		String h3=h1+"world";
		System.out.println(h.equals(h3));
		System.out.println(h==h3);
		
		
	}
	/**
	 *  public boolean equals(Object anObject) {
	 *  //��ǰ�Ķ����봫��Ķ����Ƿ���ͬһ������
        if (this == anObject) {
            return true;
        }
        //�жϴ���������ǲ��� String����
        if (anObject instanceof String) {
        	//�Ѵ���Ķ���ǿ��ת��ΪString����
            String anotherString = (String) anObject;
            //����һ��int n
             * value.lengthȡ���ַ����ĳ��ȡ���ǰ����ĳ��ȡ�
             * 
            int n = value.length;
            //�жϵ�ǰ��������Ķ���ĳ����Ƿ������ǵ�ǰ��ǰ�����Ƿ����
            if (n == anotherString.value.length) {
            	//�����ַ����飬������±��0��ʼ
                char v1[] = value;
                char v2[] = anotherString.value;
                //�����������ʼֵΪ0
                int i = 0;
                //�жϣ������ǵ�n��ǰ����ĳ��Ȳ�����0
                while (n-- != 0) {
                	//��һ�� �����õ�ǰ�����봫�����
                	 * v1[0] v2[0]
                	 * a       a
                	 * �ڶ���
                	 * v1[1] v2[1]
                	 * a      b
                    if (v1[i] != v2[i])
                            return false;
                    i++;
                }
                return true;
            }
        }
        return false;
    }
	 */
}
