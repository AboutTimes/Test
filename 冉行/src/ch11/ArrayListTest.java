package ch11;

import java.util.ArrayList;

/**
 * 集合的使用
 * 
 * @author Mountain
 * 
 */
public class ArrayListTest {
	public static void main(String[] args) {
		//创建一个集合
		ArrayList array=new ArrayList();
		array.add(44);
		array.add("中国");
		//得到集合真实的大小
		System.out.println(array.size());
		//判断元素是否为空
		System.out.println(array.isEmpty());
		//取出ArrayList中的元素
		System.out.println(array.get(0));
		System.out.println(array.get(1));
		//向集合中添加信息时，需要的是相同的类型
		//把中国出来，转换为int
		//int i= (int) array.get(1);
		
		
	}
}
