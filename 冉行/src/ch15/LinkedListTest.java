package ch15;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//创建一个链表的集合LinkedList
		List list=new LinkedList();
		//添加元素与ArrayList相同
		list.add("1");//0
		list.add("2");//0
		list.add("3");
		/*list.remove(0);
		list.remove(1);
		list.remove(2);
		*/
		for (int i = 0; i < list.size(); i++) {
			String str=(String) list.get(i);
			System.out.println(str);
		}
		System.out.println("===============");
		for(Object obj:list){
			System.out.println(obj);
		}
	}

}
