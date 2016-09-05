package ch16;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {
	public static void main(String[] args) {
		//1.创建一个LinkedList集合，并且限制只能传入猫
		//2.需要通过循环创建猫的对象并且添加到集合中
		//3.创建动物类对象,原因是我们需要传入一个集合
		//1.
		//多态的使用
		List<Cat> list=new LinkedList<Cat>() ;
		//2.
		for (int i = 0; i < 10; i++) {
			Cat cat=new Cat("小花"+i);
			//把猫的对象添加到集合中去
			list.add(cat);
		}
		//3.
		Animal animal=new Animal("猫", list);
		
		//4.输出分类
		System.out.println(animal.getClassify());
		//5.输出所有的猫吧:
		//5.1我们可以直接操作集合
		
		for (Cat cat:animal.getList()) {
			System.out.println(cat.getName());
		}
		
		//5.2我们可以先得到集合
		List<Cat> cats=animal.getList();
		for(Cat cat:cats){
			System.out.println(cat.getName());
		}
		
	}
}
