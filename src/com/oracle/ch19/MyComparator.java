package com.oracle.ch19;

import java.util.Comparator;

//ʵ��һ���ӿڣ��Ѹ����Զ������ʽ��ӵ���������ʱ��Ҫ����Ĳ���
public class MyComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		// ����ֵ��ղŵ�һ�� compareTo,���Ǹ�����Comparable
		// 0��ʾ������ͬ

		// 1.�����Ƿ�������Ķ������ǿ��ת��
		Tiger t = (Tiger) o1;
		Tiger t1 = (Tiger) o2;
		// 2.�����Ƕ����е����Խ��бȽϣ�д������Խ��бȽϼ�����дequals����
		int result = t.age - t1.age;
		int result1 = t.name.compareTo(t1.name);
		
		System.out.println(t.equals(t1));
		return 1;
	}

}
