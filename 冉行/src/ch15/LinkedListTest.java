package ch15;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//����һ������ļ���LinkedList
		List list=new LinkedList();
		//���Ԫ����ArrayList��ͬ
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
