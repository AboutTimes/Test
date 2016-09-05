package ch19;

import java.util.Comparator;

//实现一个接口，把该类以对象的形式添加到创建对象时需要传入的参数
public class MyComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		// 返回值与刚才的一样 compareTo,是那个类中Comparable
		// 0表示对象相同     

		// 1.把我们方法传入的对象进行强制转换
		Tiger t = (Tiger) o1;
		Tiger t1 = (Tiger) o2;
		// 2.把我们对象中的属性进行比较，写多个属性进行比较见意重写equals方法
		int result = t.age - t1.age;
		int result1 = t.name.hashCode() - t1.name.hashCode();
		int i = 1;
		
		
		if (result == 0 && result1 == 0) {
			i = 0;
		}
		
		return i;
		
	}
}
