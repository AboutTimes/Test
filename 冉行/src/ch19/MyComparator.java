package ch19;

import java.util.Comparator;

//ʵ��һ���ӿڣ��Ѹ����Զ������ʽ��ӵ���������ʱ��Ҫ����Ĳ���
public class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		// ����ֵ��ղŵ�һ�� compareTo,���Ǹ�����Comparable
		// 0��ʾ������ͬ     

		// 1.�����Ƿ�������Ķ������ǿ��ת��
		Tiger t = (Tiger) o1;
		Tiger t1 = (Tiger) o2;
		// 2.�����Ƕ����е����Խ��бȽϣ�д������Խ��бȽϼ�����дequals����
		int result = t.age - t1.age;
		int result1 = t.name.hashCode() - t1.name.hashCode();
		int i = 1;
		
		
		if (result == 0 && result1 == 0) {
			i = 0;
		}
		
		return i;
		
	}
}
